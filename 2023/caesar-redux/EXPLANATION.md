# Explanation — Caesar Redux

## Understanding
Apply a Caesar shift to each lowercase sentence. A published team's educational interpretation uses a backward shift when the exact token 'the' appears, forward otherwise.

## Step-by-step approach
Detect whether the sentence contains the exact word 'the'; shift lowercase letters in the selected direction; keep punctuation. O(total characters).

## Implementation checks
1. Parse input exactly.
2. Apply the stated rule and handle boundaries.
3. Print no debugging text.
4. Compare against [TEST_CASES.md](TEST_CASES.md).

## Verified scope
The exact original case-sensitivity, keyword detection, and shift rules require checking the archived PDF; this is an independently tested interpretation of a community submission.

[Independent Java implementation](Main.java). Local tests passed; official contest judge acceptance has not been verified.
