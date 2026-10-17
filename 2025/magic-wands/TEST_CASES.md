# Java tests — Magic Wands

Local Java 17 compilation and sample checks passed.

```bash
javac Main.java
java Main < sample.in
```

## Sample input
```text
4
3 2 SSH
3 2 HHH
3 2 SHS
1 1 S
```

## Expected output
```text
1
0
2
1
```

**Try additionally:** one element, repeated/equal values, impossible cases, large valid inputs and random small inputs checked by an independent brute-force oracle.

**Archive integrity:** Derived from the publicly archived IEEEXtreme 19.0 statement. The example and exhaustive small cases have been cross-checked; community discussion contains some incorrect examples.
