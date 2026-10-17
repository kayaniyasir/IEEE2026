# Step-by-step explanation — King's Order

## Key idea
Arrange N tasks satisfying prerequisite pairs (a,b), where task a must occur before task b. Of the currently available tasks, choose the one with the smallest given group number, breaking ties by task number. Output -1 if the tasks contain a cycle.

## Approach and reasoning
Apply Kahn's topological sorting algorithm with a priority queue ordered by (group ID, task ID). Pop ready tasks, decrement downstream indegrees, enqueue newly ready nodes. Return -1 if processed count is below N.

## Complexity
O((N+M) log N) time and O(N+M) memory.

## Common mistakes
- Confusing inclusive and exclusive boundaries.
- Ignoring repeated or extreme values.
- Failing to honor the exact input and output format.

## Verification
This problem name is evidenced in a 2024 contestant archive, but its exact statement and tie rules have not been checked against an official PDF; do not claim official judge acceptance.

See [Main.java](Main.java) and [sample.in](sample.in). All Java programs were compiled and tested locally; this is not an official acceptance certificate.
