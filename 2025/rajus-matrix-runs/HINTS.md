# Hints — Raju's Matrix Runs

<details><summary>Hint 1 — Core concept</summary>

Think about **Graph search + longest path**. What condition makes the answer valid?

</details>

<details><summary>Hint 2 — Strategy</summary>

Think of every valid move as a directed edge from a smaller cell to a larger one. Because values increase, the resulting graph has no directed cycle.

</details>

<details><summary>Hint 3 — Reasoning challenge</summary>

Try to prove why the algorithm will find the correct answer. Can you construct a counterexample to a simpler approach?

</details>

**Concept quiz:** What is the worst-case time complexity? What special case breaks a naive algorithm?
