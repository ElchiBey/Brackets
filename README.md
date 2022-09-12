# Brackets
### The code determines whether bracket string is correct or not.
There will be multiple lines in the input file, each having a single non-empty string.

A string containing only parentheses is balanced if the following is true:
* if it is an empty string
* if A and B are correct, AB is correct
* if A is correct, (A) and {A} and [A] are also correct.

```
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})".
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
```
