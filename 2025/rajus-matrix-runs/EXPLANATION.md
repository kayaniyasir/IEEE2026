# Explanation — Raju's Matrix Runs

## Main insight
On an N x M integer grid, move up/down/left/right (never diagonally), always to a strictly greater value. Find the maximum number of cells in any valid increasing path.

## Approach
Avoid deep recursion by building a topological order from local maxima to lower cells. Maintain the number of larger neighbours for every cell. Pop cells with zero larger neighbours, propagate longest lengths to adjacent smaller cells, and enqueue a smaller cell when all its larger neighbours have been processed. The maximum length is the answer.

## Complexity
O(NM) time and O(NM) memory.

## Testing advice
Check minimum, maximum, duplicate or tied states, and cases where no answer exists. Compare your code with [Main.java](Main.java) only after a genuine attempt.

## Transparency
A third-party archived description contains a contradictory 4x4 increasing-path example (reports 6 where strict increasing gives 5). The included 3x3 sample is independently verified and the discrepancy is documented.

The solution compiles with Java 17 and has passed the local test suite, but has not been submitted to the original judge.
