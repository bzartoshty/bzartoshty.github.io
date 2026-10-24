CHAPTER 4: MATH, CHARACTERS, AND STRINGS - JAVA EXAMPLES

Extract everything before opening the PowerPoint. Keep this folder beside the
presentation; slide links use Chapter04_Java_Examples/Filename.java.
Use Ctrl+click in editing view or click during a slide show.
Print PowerPoint using Notes Pages for slide thumbnails and teaching notes.
The separate PDF contains slides only.

Compile all: javac *.java
Run one program: java HexDigit2Dec
All files are independent programs with main methods, tested for Java 17.
The source uses Java 8-compatible APIs. In jGRASP, open a .java file and run it.
Keep chapters in separate folders to avoid duplicate class names.

INPUT AND POLICIES
Most examples use fixed inputs to make traces reproducible. RandomRanges
prints varying values; test its range properties rather than exact values.
ReadWords needs three tokens. ReadLine and ReadCharacter accept one line.
ScannerLineTransition reads an age on its own line, then a name on the next.
OrderTwoCities reads two lines and uses case-sensitive Java String order.
AsciiCharacterTest and HexDigit2Dec use explicit ASCII ranges. Unicode
recognition APIs can accept more characters than those specific policies.
HexDigit2Dec rejects empty/multi-character lines and surrounding spaces.
SplitName is a delimiter exercise, not a full human-name parser.
FileExtension expects a simple filename without a folder path.
Locale.US controls formatted decimal output; Locale.ROOT controls case mapping.
Comments mark intentionally invalid calls without executing them.
Read individual source headers and slide notes for the exact assumptions.

SLIDE-TO-FILE INDEX AND SAMPLE INPUT
Slides 3: MathBasics.java
Slides 4: PowersAndRoots.java
Slides 5: RadiansDemo.java
Slides 6: CeilFloorDemo.java
Slides 7: RoundingTies.java
Slides 9: MinMaxAbs.java
Slides 10: RandomRanges.java
Slides 11: MathQuiz.java
Slides 16: BinaryPlaceValue.java
Slides 17: OctalPlaceValue.java
Slides 18: HexPlaceValue.java
Slides 23: BaseLiterals.java
Slides 24: ParseRadix.java
Slides 25: FormatRadix.java
Slides 26: BasesQuiz.java
Slides 28: CharacterBasics.java
Slides 30: UnicodeLength.java
Slides 32: EscapeSequences.java
Slides 33: CharNumericConversions.java
Slides 34: CharacterArithmetic.java
Slides 35: AsciiCharacterTest.java
  Sample input: 'A'
Slides 36: CharacterMethods.java
Slides 37: UnicodeCharacterTest.java
Slides 38: CharactersQuiz.java
Slides 39: PrintfBasics.java
Slides 41: FormatFlags.java
Slides 42: FormatDemo.java
Slides 44: FormattingQuiz.java
Slides 45: StringBasics.java
Slides 46: StaticAndInstance.java
Slides 48: CharAtDemo.java
Slides 49: StringConcatenation.java
Slides 50: StringCaseAndTrim.java
Slides 51: StringImmutability.java
Slides 52: StringsQuiz.java
Slides 53: ReadWords.java
  Sample input: 'Ada Lovelace Java'
Slides 54: ReadLine.java
  Sample input: 'New York'
Slides 55: ScannerLineTransition.java
  Sample input: '20\nAda Lovelace'
Slides 56: ReadCharacter.java
  Sample input: 'Ada'
Slides 58: StringEquality.java
Slides 59: StringOrdering.java
Slides 60: OrderTwoCities.java
  Sample input: 'New York\nBoston'
Slides 61: PrefixesAndSuffixes.java
Slides 62: SubstringDemo.java
Slides 63: IndexOfDemo.java
Slides 64: LastIndexOfDemo.java
Slides 65: SplitName.java
  Sample input: 'Kim Jones'
Slides 66: StringNumberConversion.java
Slides 67: FormattedString.java
Slides 68: TextOperationsQuiz.java
Slides 70, 71: HexDigit2Dec.java
  Sample input: 'F'
Slides 73: FileExtension.java
  Sample input: 'report.final.PDF'
