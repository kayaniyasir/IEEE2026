# IEEE2026 — IEEEXtreme Java Learning Hub

**9 authentic IEEEXtreme problem titles** from 2023 (17.0), 2024 (18.0) and 2025 (19.0), with seven learning files plus inputs/outputs for each. Designed for students learning competitive programming in **Java 17**.

**Live site (once GitHub Pages is enabled):** https://kayaniyasir.github.io/IEEE2026/

## Browse the problem folders

| Year / contest | Problem | Primary learning topic |
|---|---|---|
| 2023 · 17.0 | [Restaurant Cipher](2023/restaurant-cipher/README.md) | Strings |
| 2023 · 17.0 | [Happy Numbers](2023/happy-numbers/README.md) | Number theory |
| 2023 · 17.0 | [Caesar Redux](2023/caesar-redux/README.md) | Strings |
| 2024 · 18.0 | [Stick](2024/stick/README.md) | Geometry |
| 2024 · 18.0 | [Two Fridges](2024/two-fridges/README.md) | Intervals |
| 2024 · 18.0 | [King's Order](2024/kings-order/README.md) | Graphs |
| 2025 · 19.0 | [The Twin Occurrence Quest](2025/twin-occurrence-quest/README.md) | Binary search |
| 2025 · 19.0 | [Magic Wands](2025/magic-wands/README.md) | Greedy |
| 2025 · 19.0 | [Raju's Matrix Runs](2025/rajus-matrix-runs/README.md) | Graph DP |

Browse year indexes: [2023](2023/README.md) · [2024](2024/README.md) · [2025](2025/README.md).

### Files per problem
1. **README.md** — learning order, topic, and authentic archived source link
2. **QUESTION.md** — original educational paraphrase, constraints and sample
3. **HINTS.md** — three progressive hints to try before reading the solution
4. **EXPLANATION.md** — reasoning, algorithm and complexity
5. **Main.java** — independent runnable Java 17 solution
6. **TEST_CASES.md** — sample, expected output and edge-case guidance
7. **AI_PROMPT.md** — hints-only and code review prompts, following live competition rules

Each folder additionally includes `sample.in` and `sample.out`.

### Run solutions

```bash
cd 2025/twin-occurrence-quest
javac Main.java
java Main < sample.in
```

To test all nine examples, run `python tests/check_samples.py`. The [Java CI workflow](.github/workflows/java-checks.yml) runs these checks on pushes and pull requests.

## Verification and limitations

- The **problem titles and contest years** have provenance in authentic past-contest archives, linked from each question folder.
- All nine Java implementations compiled successfully and **187 local sample and independent development checks passed**. The CI workflow compiles and tests the included samples; additional development tests are documented in the downloadable package.
- **Compilation or local tests do not guarantee contest judge acceptance.** Archived third-party descriptions may be incomplete or erroneous.
- Some exact 2023 contest rules were unavailable as extractable text in their original PDF archives; educational reconstructions are labeled as such. In particular, the 2023 Happy Numbers output uses an *illustrative modulo* pending confirmation from the original contest statement.
- One 2025 community archive includes an inconsistent example for Raju's Matrix Runs; the folder replaces that example with an independently verified case.
- All problem write-ups here are original educational paraphrases. Full problem copyrights remain with their respective owners.

## Website publication

GitHub Pages must be enabled for this repository. Open [Settings → Pages](https://github.com/kayaniyasir/IEEE2026/settings/pages), select **GitHub Actions** as the build source, and run the [Pages deployment workflow](.github/workflows/pages.yml). The deployment page indicates whether the site is live.

**Maintainer:** Dr. Yasir Javed. Independent educational project, not an official IEEE or IEEEXtreme publication.
