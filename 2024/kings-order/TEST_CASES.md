# Test cases — King's Order

Use the included `sample.in` and `sample.out` files to reproduce the teaching case:

```bash
javac Main.java
java Main < sample.in
```

### Input
```text
4 3
2 1 2 1
1 3
2 3
4 3
```

### Expected output
```text
2 4 1 3
```

**Extra tests:** zero/minimum values if allowed, single-element cases, duplicate or equal values, impossible cases and performance at contest limits.

**Status:** Compiled on Java 17 and passed development checks. Original judge acceptance is not claimed.
