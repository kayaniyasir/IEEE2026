# Step-by-step explanation — Stick

## Key idea
N identical squares have side 2L. Each successive square is translated K units right and K units up. Compute the union area of all squares.

## Approach and reasoning
Let side=2L and overlap=max(side-K,0). The union area is N·side²-(N-1)·overlap². Every new square contributes an equal new uncovered region; farther overlaps lie inside the preceding overlap. Calculate exactly using BigInteger.

## Complexity
O(1) arithmetic operations in terms of N, with BigInteger digit-complexity for huge operands.

## Common mistakes
- Confusing inclusive and exclusive boundaries.
- Ignoring repeated or extreme values.
- Failing to honor the exact input and output format.

## Verification
The archived competition title and formula are corroborated by contestant materials. Exact original limits should be checked at the source.

See [Main.java](Main.java) and [sample.in](sample.in). All Java programs were compiled and tested locally; this is not an official acceptance certificate.
