# Explanation — Restaurant Cipher

## Understanding
For each text line, count A through G (case-insensitive) and report the most frequent letter; break ties alphabetically.

## Step-by-step approach
Count allowed letters, then select the smallest alphabetic maximum. O(total characters) time and O(1) extra space.

## Implementation checks
1. Parse input exactly.
2. Apply the stated rule and handle boundaries.
3. Print no debugging text.
4. Compare against [TEST_CASES.md](TEST_CASES.md).

## Verified scope
The community archive contains an original contest PDF, but its complete constraints and tie rules have not been independently verified.

[Independent Java implementation](Main.java). Local tests passed; official contest judge acceptance has not been verified.
