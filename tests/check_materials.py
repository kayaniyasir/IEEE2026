#!/usr/bin/env python3
"""Check every Java problem folder has consistent plain-text learning materials."""
from pathlib import Path
root = Path(__file__).resolve().parents[1]
folders = {
    "2023": ("caesar-redux","happy-numbers","restaurant-cipher"),
    "2024": ("kings-order","stick","two-fridges"),
    "2025": ("magic-wands","rajus-matrix-runs","twin-occurrence-quest")
}
documents = ("QUESTION","EXPLANATION","HINTS","TEST_CASES","AI_PROMPT")
count = 0
for year,slugs in folders.items():
    for slug in slugs:
        directory = root / year / slug
        readme = (directory / "README.md").read_text(encoding="utf-8")
        docs={}
        for name in documents:
            path=directory / (name+".txt")
            assert path.is_file(), f"Missing {path}"
            content=path.read_text(encoding="utf-8")
            assert len(content)>450, f"Too short: {path}"
            assert name+".txt" in readme, f"Broken index: {path}"
            assert not (directory / (name+".md")).exists(), f"Stale Markdown: {name} {slug}"
            docs[name]=content
        question=docs["QUESTION"].lower()
        prompt=docs["AI_PROMPT"].lower()
        assert "sample" in question and "output" in question and "input" in question, slug
        assert "complete question" in prompt and ("end of question" in prompt or "end complete question" in prompt), slug
        assert "how to solve" in prompt and "public class main" in prompt, slug
        assert "sample.in" in docs["TEST_CASES"] and "sample.out" in docs["TEST_CASES"],slug
        assert (directory / "Main.java").exists(), slug
        assert (directory / "sample.in").exists() and (directory / "sample.out").exists(),slug
        count+=1
assert count == 9
print(f"PASS: {count} problems, {count*len(documents)} plain-text learning files, full prompts and working links.")
