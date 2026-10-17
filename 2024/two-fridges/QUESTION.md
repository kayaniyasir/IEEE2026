# Two Fridges — educational paraphrase of a real 2024 IEEEXtreme problem

[Check original source](https://csacademy.com/ieeextreme-practice/task/two-fridges). This is not a verbatim reproduction of a copyrighted contest statement.

## Problem
Each substance stays safe within an inclusive integer temperature interval [a,b]. Select two integer refrigerator temperatures such that every interval contains at least one chosen temperature. Among solutions, choose the lexicographically smallest ordered pair.

## Input
Integer N, then N lines with a and b.

## Output
T1 T2 with T1 <= T2, or -1 when no valid pair exists.

## Constraints and fidelity
0<=N<=100; -100<=a<=b<=100; choose both temperatures within [-100,100].

## Sample input
```text
2
10 12
20 24
```

## Sample output
```text
10 20
```

*Sample has been independently checked, and is not labeled as an original official sample.*

Input domain and tie-breaking are supported by a public IEEEXtreme practice statement. The example is independently checked.
