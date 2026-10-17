# Explanation — The Twin Occurrence Quest

## Main insight
Given a sorted nondecreasing integer array and Q query values X, print the 1-indexed first and last positions where X occurs. If absent, print -1 -1.

## Approach
For each query, lower_bound locates the first possible X and upper_bound locates the position after the last X. Convert from zero-based Java indices to one-based positions.

## Complexity
O(N+Q log N) time and O(N) memory.

## Testing advice
Check minimum, maximum, duplicate or tied states, and cases where no answer exists. Compare your code with [Main.java](Main.java) only after a genuine attempt.

## Transparency
Problem format, numerical limits, and example were compared to a publicly archived IEEEXtreme 19.0 statement. Local tests pass; contest judge acceptance is unverified.

The solution compiles with Java 17 and has passed the local test suite, but has not been submitted to the original judge.
