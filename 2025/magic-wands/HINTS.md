# Hints — Magic Wands

<details><summary>Hint 1 — Core concept</summary>

Think about **Greedy + difference array**. What condition makes the answer valid?

</details>

<details><summary>Hint 2 — Strategy</summary>

Scan left-to-right. Before processing position i, combine the original letter with the parity of all flips still affecting i. A sad position must be flipped starting there, if possible.

</details>

<details><summary>Hint 3 — Reasoning challenge</summary>

Try to prove why the algorithm will find the correct answer. Can you construct a counterexample to a simpler approach?

</details>

**Concept quiz:** What is the worst-case time complexity? What special case breaks a naive algorithm?
