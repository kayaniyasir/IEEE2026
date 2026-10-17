# Explanation — Happy Numbers

## Understanding
Count happy integers in a closed range. A happy number repeatedly replaces itself by the sum of the squares of its digits and eventually reaches 1.

## Step-by-step approach
Count happy numbers up to R and subtract up to L-1, using digit DP with tight/loose states and cycle classification. O(81 D² × 10) time for D digits.

## Implementation checks
1. Parse input exactly.
2. Apply the stated rule and handle boundaries.
3. Print no debugging text.
4. Compare against [TEST_CASES.md](TEST_CASES.md).

## Verified scope
The archived public solution reads one range, but the original numerical limits and whether output uses a modulus must be confirmed against the original PDF.

[Independent Java implementation](Main.java). Local tests passed; official contest judge acceptance has not been verified.
