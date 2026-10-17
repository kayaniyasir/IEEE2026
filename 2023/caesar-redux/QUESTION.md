# Caesar Redux — IEEEXtreme 17.0 (2023)

**Original paraphrase based on an authentic problem archive.** [View archived contest PDF](https://github.com/kmishmael/IEEEXtreme-17.0/blob/main/Ceasar%20Redux/caesar%20redux.pdf).

## Task
Apply a Caesar shift to each lowercase sentence. A published team's educational interpretation uses a backward shift when the exact token 'the' appears, forward otherwise.

## Input
T; for each case, a shift integer on one line and a complete text line on the next.

## Output
One converted sentence per input case.

## Sample input (independently created test)
```text
2
3
the cat
3
abc xyz
```

## Expected output
```text
qeb zxq
def abc
```

### Source confidence
The exact original case-sensitivity, keyword detection, and shift rules require checking the archived PDF; this is an independently tested interpretation of a community submission.

Please consult the original archived PDF for precise contest constraints before making judge-acceptance claims.
