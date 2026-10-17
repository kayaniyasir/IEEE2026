# Explanation — Magic Wands

## Main insight
For each string S of H (happy) and S (sad), a magic wand flips the mood of exactly K consecutive characters. Determine the smallest number of operations to make every character H; print -1 if impossible.

## Approach
Greedily start a flip whenever the current effective value is sad; no later flip can affect that position once the scan moves right. Use an array marking where each flip expires to maintain parity in O(1) per position.

## Complexity
O(sum N) time and O(max N) memory.

## Testing advice
Check minimum, maximum, duplicate or tied states, and cases where no answer exists. Compare your code with [Main.java](Main.java) only after a genuine attempt.

## Transparency
Derived from the publicly archived IEEEXtreme 19.0 statement. The example and exhaustive small cases have been cross-checked; community discussion contains some incorrect examples.

The solution compiles with Java 17 and has passed the local test suite, but has not been submitted to the original judge.
