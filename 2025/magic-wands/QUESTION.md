# Magic Wands — independently written paraphrase of a real 2025 IEEEXtreme problem

[Read publicly archived statement](https://github.com/AlejandroG-code/IEEEXtreme19-Solutions/blob/main/Magic%20Wands/problem.md). The text here is educational paraphrase, not a reproduction of official copyrighted text.

## Task
For each string S of H (happy) and S (sad), a magic wand flips the mood of exactly K consecutive characters. Determine the smallest number of operations to make every character H; print -1 if impossible.

## Input
T test cases; for each case N K and a length-N string of H and S.

## Output
One minimum-operation count per case, or -1.

## Constraints
N,K<=100,000; the sum of N over all test cases <=200,000.

## Test input
```text
4
3 2 SSH
3 2 HHH
3 2 SHS
1 1 S
```

## Test output
```text
1
0
2
1
```

**Sample provenance:** Verified independent teaching case or archived example; this page does not claim official judge acceptance.

**Archive limitations:** Derived from the publicly archived IEEEXtreme 19.0 statement. The example and exhaustive small cases have been cross-checked; community discussion contains some incorrect examples.
