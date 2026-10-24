CHAPTER 6: METHODS - JAVA EXAMPLES

Source: Chapter06_Methods.pptx (47 slides), COMP 110.
Files use the default package so they work in jGRASP or from a command prompt.
Each public class name matches its filename. No external libraries are needed.

QUICK START
Extract all files into the same folder. Open a terminal in that folder.
Compile: javac *.java
Run, for example: java SumRangeDemo
For jGRASP, open the desired .java file, then Compile and Run.

NumberTools is a utility class. Run NumberToolsDemo to demonstrate it.
NumberToolsDemo requires NumberTools.java. ThreeScoreReport requires
ScoreReport.java. Keep these files together and compile all files first.

INPUT
ScoreReport asks for two numeric scores from 0 through 100.
Try 80 and 90. Expected average: 85.0. Expected grade: B.
ThreeScoreReport asks for three such scores.
Try 70, 80, and 90. Expected average: 80.0. Grade: B. Highest: 90.0.
These introductory programs assume valid input, as the slides specify.

INTENTIONAL ERRORS
The ambiguous overload, nested redeclaration, out-of-scope reads, unassigned
local, and void-assignment examples remain in comments. All provided files
compile together. Uncomment an indicated line to explore the compiler error,
then comment it again before compiling the full folder.

NOTES
Method bodies follow the slides. Demonstration main methods add fixed inputs
and console output so each concept can run. The discussion and quiz examples
include solutions. Arrays in a few demonstration harnesses simply group test
inputs. Keep the documented numeric ranges to avoid integer overflow.

FILE INDEX (slide numbers refer to the enhanced PowerPoint)
Slides 3-4: RepeatedSums.java
  Calculate three sums using repeated loops.
Slides 5-6: SumRangeDemo.java
  Reuse a method with different arguments.
Slides 7-8, 10: MaxDemo.java
  Identify parameters, arguments, and returned values.
Slides 9: MethodSignatureDemo.java
  Overload a name using different parameter types.
Slides 11: MethodVocabularyQuiz.java
  Reveal answers to the vocabulary quiz.
Slides 12: SignDemo.java
  Return a value on every normal path.
Slides 13: NPrintlnDemo.java
  Print a message with a void method.
Slides 14-15: LetterGradeDemo.java
  Separate grade calculation from printing.
Slides 16: NumberTools.java
  Provide a public static method for another class.
Slides 16: NumberToolsDemo.java
  Call a public static method from another class.
Slides 17-18: IncrementDemo.java
  Trace a copied primitive value.
Slides 19: SwapDemo.java
  Show why swapping parameter copies does not swap caller variables.
Slides 20: IncrementReturnDemo.java
  Assign a returned value in the caller.
Slides 21: PassByValueQuiz.java
  Compare discarding a return value with assigning it.
Slides 22-23: GcdDemo.java
  Find the greatest common divisor using a reusable method.
Slides 24: PrimeTestDemo.java
  Test whether individual integers are prime.
Slides 25: First50Primes.java
  Use isPrime to print five rows of ten primes.
Slides 26: ContractsQuiz.java
  Run examples that answer the contracts and boundary-test quiz.
Slides 27-28: HexDigitDemo.java
  Convert one uppercase hexadecimal digit.
Slides 27, 29: HexToDecimalDemo.java
  Convert an uppercase hexadecimal string.
Slides 30-31: OverloadingDemo.java
  Select between int and double overloads.
Slides 32-33: AmbiguousOverloadingDemo.java
  Keep an ambiguous call as a commented exercise and show repairs.
Slides 34-35: LoopScopeDemo.java
  Demonstrate loop-header and loop-body variable scopes.
Slides 36: SeparateLoopScopesDemo.java
  Reuse a name in separate, nonoverlapping loop scopes.
Slides 37: NestedScopeDemo.java
  Repair a nested local-variable redeclaration.
Slides 38: ScopeQuiz.java
  Demonstrate separate method scopes and definite assignment.
Slides 40-43: ScoreReport.java
  Assemble the complete two-score report.
Slides 44: ThreeScoreReport.java
  Implement the discussion extension with three scores and a highest score.
Slides 45-46: CountMultiplesOfThreeDemo.java
  Solve the exit quiz and check inclusive bounds.
Slides 47 (notes): MaxOfThreeDemo.java
  Complete the review practice using a two-argument max method.

EXPECTED OUTPUTS

RepeatedSums
55
275
440

SumRangeDemo
55
275
440

MaxDemo
12
12

MethodSignatureDemo
describe(int): 7
describe(double): 7.5

MethodVocabularyQuiz
1. Arguments in max(7, 12): 7 and 12
2. square(int) returns: 25
3. Renaming a parameter does not create an overload.

SignDemo
1
0
-1

NPrintlnDemo
Welcome to Java
Welcome to Java
Welcome to Java

LetterGradeDemo
59: F
60: D
69: D
70: C
79: C
80: B
85: B
89: B
90: A
100: A

NumberToolsDemo
36

IncrementDemo
2
1

SwapDemo
5 10

IncrementReturnDemo
2

PassByValueQuiz
1. 4
2. 8
3. A void method cannot supply an int value.

GcdDemo
6
1
8
1

PrimeTestDemo
1: false
2: true
9: false
13: true

First50Primes
   2   3   5   7  11  13  17  19  23  29
  31  37  41  43  47  53  59  61  67  71
  73  79  83  89  97 101 103 107 109 113
 127 131 137 139 149 151 157 163 167 173
 179 181 191 193 197 199 211 223 227 229

ContractsQuiz
1. gcd(9, 12) = 3
2. isPrime(1) = false
3. Threshold tests: B then A
4. (0, 7) and (-2, 6) violate the positive-input precondition.

HexDigitDemo
7
12
15

HexToDecimalDemo
687
27
0

OverloadingDemo
5
5.0
5.0

AmbiguousOverloadingDemo
2.0
2.0

LoopScopeDemo
0
2
4

SeparateLoopScopesDemo
1
2
3
5
6

NestedScopeDemo
0

ScopeQuiz
1
2
0

ScoreReport (input: 80 90)
Score (0 to 100): Score (0 to 100): Average: 85.0
Grade: B

ThreeScoreReport (input: 70 80 90)
Score (0 to 100): Score (0 to 100): Score (0 to 100): Average: 80.0
Grade: B
Highest: 90.0

CountMultiplesOfThreeDemo
3
1
0
1
2

MaxOfThreeDemo
9
5
-3
