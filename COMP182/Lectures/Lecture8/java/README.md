# Lecture 08: Stack examples

Download all Java files into one folder. Requires JDK 8 or later and no extra libraries.

```sh
javac *.java
java StackExamplesTest
java StackDemo
java BracketChecker
java ExpressionDemo
java FlightSearchDemo
java RecursionDemo
```

| Slides | Files |
| --- | --- |
| 2-4, 11 | StackDemo.java |
| 3, 6-10 | GenericStack.java, LinkedStack.java |
| 5 | BracketChecker.java |
| 12-14 | ExpressionDemo.java |
| 15-21 | FlightSearchDemo.java |
| 22 | RecursionDemo.java |
| All examples | StackExamplesTest.java |

GenericStack and LinkedStack are supporting classes and do not have main methods.

ExpressionDemo supports binary +, -, *, /, parentheses, and nonnegative integer infix operands. Postfix tokens must be separated by whitespace. It uses checked long arithmetic and Java integer division. Unary infix operators are outside this example's grammar.

BracketChecker is a simplified text checker. It does not parse Java strings or comments. FlightSearchDemo solves directed reachability, not a shortest-path problem.

Expected highlights: CAT reverses to TAC; `2 * (3 + 4)` becomes `2 3 4 + *` and evaluates to 14; P-to-Z returns `[P, W, Y, Z]`; factorial(3) returns 6.
