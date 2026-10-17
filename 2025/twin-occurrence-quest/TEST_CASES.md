# Java tests — The Twin Occurrence Quest

Local Java 17 compilation and sample checks passed.

```bash
javac Main.java
java Main < sample.in
```

## Sample input
```text
8 4
2 4 4 4 5 8 10 12
4
10
5
11
```

## Expected output
```text
2 4
7 7
5 5
-1 -1
```

**Try additionally:** one element, repeated/equal values, impossible cases, large valid inputs and random small inputs checked by an independent brute-force oracle.

**Archive integrity:** Problem format, numerical limits, and example were compared to a publicly archived IEEEXtreme 19.0 statement. Local tests pass; contest judge acceptance is unverified.
