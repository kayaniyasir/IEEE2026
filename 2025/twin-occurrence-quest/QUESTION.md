# The Twin Occurrence Quest — independently written paraphrase of a real 2025 IEEEXtreme problem

[Read publicly archived statement](https://github.com/AlejandroG-code/IEEEXtreme19-Solutions/blob/main/The%20Twin%20Occurrence%20Quest/problem.md). The text here is educational paraphrase, not a reproduction of official copyrighted text.

## Task
Given a sorted nondecreasing integer array and Q query values X, print the 1-indexed first and last positions where X occurs. If absent, print -1 -1.

## Input
N Q; N sorted integers; Q query values (one per line or whitespace-separated).

## Output
For each query, 'first last' using 1-based indexing, or -1 -1.

## Constraints
1<=N,Q<=100,000; each array value and query within +/-10^9.

## Test input
```text
8 4
2 4 4 4 5 8 10 12
4
10
5
11
```

## Test output
```text
2 4
7 7
5 5
-1 -1
```

**Sample provenance:** Verified independent teaching case or archived example; this page does not claim official judge acceptance.

**Archive limitations:** Problem format, numerical limits, and example were compared to a publicly archived IEEEXtreme 19.0 statement. Local tests pass; contest judge acceptance is unverified.
