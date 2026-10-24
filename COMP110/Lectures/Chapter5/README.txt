CHAPTER 5 LOOPS JAVA EXAMPLES

Extract everything together. Keep this folder beside the PowerPoint;
local links use Chapter05_Java_Examples/Filename.java. Use Ctrl+click in
editing view or click during a slide show. Print Notes Pages for slide
thumbnails and teaching notes. The separate PDF contains slides only.

Compile all: javac *.java
Run one program: java DigitSum
Each file is an independent program with main. Tested for Java 17;
the files use Java 8-compatible APIs. Keep chapters in separate folders.

Input must follow the individual file's stated token and range assumptions.
SentinelValue ends on 0; SentinelAverage ends on -1. EndOfInputSum ends
on EOF or a non-int token. Guessing programs generate one random target
from 0-100 and ask for integer guesses. InputValidationLoop repeats until
an integer from 1-5 is supplied. Palindrome uses exact ASCII comparison,
including case, spaces, and punctuation. DigitReport counts ASCII digits.
DigitSum, ReverseAndAdd, and Dec2Hex reject negative input. See headers.

RepeatMessage prints 100 lines. MultiTable prints 9 rows of 9 products.
PrimeNumber prints the first 50 primes in five lines of ten.
ForSemicolonPitfall is an intentional logic mistake; CompactForDemo is
deliberately compact. BoundedFloatingLoop has a hard step limit so the
floating-point equality problem can be observed without hanging.
The tuition example is a hypothetical fixed 7% arithmetic model.

SLIDE TO FILE INDEX AND SAMPLE INPUT
Slides 3: RepeatMessage.java
Slides 5, 6: WhileTrace.java
Slides 7: ZeroIterations.java
Slides 8: WhileQuiz.java
Slides 9: PrintOneToTen.java
Slides 10: PrintTwentyToFifty.java
Slides 11: OddNumbers.java
Slides 12: SumOneToN.java
  Sample input: '100'
Slides 13: SumTenNumbers.java
  Sample input: '1 2 3 4 5 6 7 8 9 10'
Slides 15: DigitSum.java
  Sample input: '1024'
Slides 16, 17: ReverseAndAdd.java
  Sample input: '1024'
Slides 18: SentinelValue.java
  Sample input: '5 3 -2 0'
Slides 19: SentinelAverage.java
  Sample input: '10 20 -1'
Slides 20: EndOfInputSum.java
  Sample input: '1 2 3'
Slides 22: BoundedFloatingLoop.java
Slides 23: IntegerControlledSeries.java
Slides 24: DoWhileDemo.java
Slides 25: InputValidationLoop.java
  Sample input: '0 3'
Slides 26, 27: ForTrace.java
Slides 28: OffByOneQuiz.java
Slides 29: EquivalentLoops.java
Slides 30: ForSemicolonPitfall.java
Slides 31: CompactForDemo.java
Slides 33: NestedLoops.java
Slides 34: MultiTable.java
Slides 35: TrianglePattern.java
Slides 37: GreatestCommonDivisor.java
  Sample input: '16 24'
Slides 38: EuclidGcd.java
  Sample input: '24 16'
Slides 39: FutureTuition.java
Slides 40: Dec2Hex.java
  Sample input: '123'
Slides 42: TestBreak.java
Slides 43: TestContinue.java
Slides 44: ForContinue.java
Slides 45: NestedBreak.java
Slides 46: GuessNumberOneTime.java
  Input: respond to the generated guessing prompt.
Slides 47: GuessNumber.java
  Input: respond to the generated guessing prompt.
Slides 48: GuessNumberUsingBreak.java
  Input: respond to the generated guessing prompt.
Slides 50, 51: Palindrome.java
  Sample input: 'noon'
Slides 53, 54: PrimeNumber.java
Slides 56: PrimeFactors.java
  Sample input: '120'
Slides 58: SumSeries.java
Slides 61: DigitReport.java
  Sample input: 'Room 204'
