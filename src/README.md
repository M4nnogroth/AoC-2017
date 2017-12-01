# Day 1: Inverse Captcha

## Part one
Match with next digit (`i + 1`)

* `1122` produces a sum of `3 (1 + 2)` because the first digit `(1)` matches the second digit and the third digit `(2)` matches the fourth digit.
* `1111` produces `4` because each digit (all `1`) matches the next.
* `1234` produces `0` because no digit matches the next.
* `91212129` produces `9` because the only digit that matches the next one is the last digit, `9`.

## Part two
Match with digit that is halfway (`length/2`) across sequence. Assume length is always even

#### Example data
* `1212` produces `6`: the list contains `4` items, and all four digits match the digit `2` items ahead.
* `1221` produces `0`, because every comparison is between a `1` and a `2`.
* `123425` produces `4`, because both `2`s match each other, but no other digit has a match.
* `123123` produces `12`.
* `12131415` produces `4`.
