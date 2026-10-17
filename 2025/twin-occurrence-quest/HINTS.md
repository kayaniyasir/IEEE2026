# Hints — The Twin Occurrence Quest

<details><summary>Hint 1 — Core concept</summary>

Think about **Binary search / sorted arrays**. What condition makes the answer valid?

</details>

<details><summary>Hint 2 — Strategy</summary>

Use two binary searches: first index >= X, then first index > X. If the first index equals N or the value is different, X is absent.

</details>

<details><summary>Hint 3 — Reasoning challenge</summary>

Try to prove why the algorithm will find the correct answer. Can you construct a counterexample to a simpler approach?

</details>

**Concept quiz:** What is the worst-case time complexity? What special case breaks a naive algorithm?
