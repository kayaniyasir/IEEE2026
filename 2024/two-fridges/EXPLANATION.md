# Step-by-step explanation — Two Fridges

## Key idea
Each substance stays safe within an inclusive integer temperature interval [a,b]. Select two integer refrigerator temperatures such that every interval contains at least one chosen temperature. Among solutions, choose the lexicographically smallest ordered pair.

## Approach and reasoning
Try each pair x,y in increasing lexicographical order. Scan all intervals, rejecting pairs when neither x nor y falls within an interval. The first valid pair is lexicographically smallest.

## Complexity
O(201² × N) time, O(N) memory.

## Common mistakes
- Confusing inclusive and exclusive boundaries.
- Ignoring repeated or extreme values.
- Failing to honor the exact input and output format.

## Verification
Input domain and tie-breaking are supported by a public IEEEXtreme practice statement. The example is independently checked.

See [Main.java](Main.java) and [sample.in](sample.in). All Java programs were compiled and tested locally; this is not an official acceptance certificate.
