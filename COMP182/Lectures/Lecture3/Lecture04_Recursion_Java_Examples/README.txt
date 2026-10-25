COMP 182 LECTURE 4 RECURSION JAVA EXAMPLES

Extract the complete bundle and keep this folder beside Lecture04_Recursion.pptx.
Use Ctrl+click in editing view, or click in a slide show, to follow local links.
Print the PowerPoint with File > Print > Notes Pages for slide thumbnails and
teaching notes. The separate PDF contains only slides.

Compile from this Java folder with JDK 17 or newer:
  javac -d classes *.java
Run any example without arguments for its worked sample:
  java -cp classes Countdown
  java -cp classes Factorial 20
  java -cp classes ReversePrint CODE
  java -cp classes Fibonacci 10
  java -cp classes Palindrome madam
  java -cp classes RecursiveBinarySearch 24
  java -cp classes TowerOfHanoi 3
  java -cp classes GcdIterative 27 18
  java -cp classes GcdRecursive 27 18

Quote text arguments that contain spaces. Empty text can also be tested by
calling the helper from a driver. Each source includes its input contract.
Factorial supports 0..20. Naive Fibonacci has numeric range 0..92, but large
values take impractical time: use n <= 10 when tracing. Countdown, reverse,
palindrome, and Hanoi can exhaust the stack for sufficiently large inputs.
Hanoi prints exponentially many moves: use small disk counts.
Reverse and palindrome operate on UTF-16 char units; classroom samples use ASCII.
Binary search requires sorted input. The two GCD methods accept any int pair,
return a nonnegative long, and explicitly define gcd(0,0) as 0.

SOURCE METHOD INDEX
Slide 8: Countdown.java
Slide 9: Factorial.java
Slide 11: ReversePrint.java
Slide 13: Fibonacci.java
Slide 14: Palindrome.java
Slide 15: RecursiveBinarySearch.java
Slide 19: TowerOfHanoi.java
Slide 21: GcdIterative.java
Slide 22: GcdRecursive.java
