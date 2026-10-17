# Java tests — Raju's Matrix Runs

Local Java 17 compilation and sample checks passed.

```bash
javac Main.java
java Main < sample.in
```

## Sample input
```text
3 3
1 2 3
6 5 4
7 8 9
```

## Expected output
```text
9
```

**Try additionally:** one element, repeated/equal values, impossible cases, large valid inputs and random small inputs checked by an independent brute-force oracle.

**Archive integrity:** A third-party archived description contains a contradictory 4x4 increasing-path example (reports 6 where strict increasing gives 5). The included 3x3 sample is independently verified and the discrepancy is documented.
