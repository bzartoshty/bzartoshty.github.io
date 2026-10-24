CHAPTER 11 INHERITANCE AND POLYMORPHISM JAVA EXAMPLES

Extract the whole bundle. Keep Chapter11_Java_Examples beside the PowerPoint,
including its access/base and access/child subfolders. Slide links are local.
Use Ctrl+click in editing view or click in a slide show. Print Notes Pages for
slide thumbnails and teaching notes. The separate PDF contains slides only.

JAVA VERSION
Compile with Java 17 or newer. PatternMatchingDemo uses Java 16+ syntax.
Constructor statements and classic switch/access examples target Java 17.
No third-party library is required. Lombok is an optional discussion only.

COMPILE ALL IN POWERSHELL FROM THIS FOLDER
$javaSources = Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName
javac -d classes $javaSources
java -cp classes TestCircleRectangle
java -cp classes access.child.ProtectedAccessDemo
java -cp classes access.base.PeerDemo

In jGRASP, default-package drivers compile with the model files nearby.
The package examples require their preserved folders and a correct classpath.
Keep different chapters in different folders to avoid class-name conflicts.

MODELS AND CONTRACTS
GeometricObject has shared color/filled/timestamp state and no area method.
Circle and Rectangle extend it. Dimensions are finite and nonnegative;
ordinary magnitudes are assumed for finite area/volume calculations.
Cylinder uses composition. Circle retains identity equality; CircleValue is
a separate immutable exact-radius value with equals(Object) and hashCode.
MyStack uses a private ArrayList<Object>; it rejects null and throws on empty
peek/pop. search returns the backing-list index from the bottom, or -1.
ArrayList copy examples copy references, not referenced objects.
Protected package examples include commented invalid statements for study.
StaticHidingDemo and EqualsOverloadDemo intentionally expose API pitfalls.

INPUT
DistinctNumbers reads int tokens until 0 and excludes that sentinel.
StackReverseWords reads whitespace-separated words until EOF.
Other runnable drivers use fixed inputs. ObjectToStringDemo includes a
varying hash-code representation. ListShuffleDemo uses a fixed random seed;
its portable contract is a permutation preserving element multiplicities.

SLIDE TO FILE INDEX
Slides 5, 6: GeometricObject.java (model)
Slides 7, 8, 17: Circle.java (model)
Slides 9: Rectangle.java (model)
Slides 10: TestCircleRectangle.java (run TestCircleRectangle)
Slides 11, 12: ConstructorOrderDemo.java (run ConstructorOrderDemo)
Slides 13: RequiredFruit.java (model)
Slides 14: Apple.java (model)
Slides 15: FruitConstructorDemo.java (run FruitConstructorDemo)
Slides 18: Cylinder.java (model)
Slides 19: CylinderDemo.java (run CylinderDemo)
Slides 20, 21: MethodMatchingDemo.java (run MethodMatchingDemo)
Slides 22: CovariantReturnDemo.java (run CovariantReturnDemo)
Slides 23: StaticHidingDemo.java (run StaticHidingDemo)
Slides 24: PrivateMethodsDemo.java (run PrivateMethodsDemo)
Slides 26: ObjectToStringDemo.java (run ObjectToStringDemo)
Slides 27: Person.java (model)
Slides 28: Student.java (model)
Slides 29: GraduateStudent.java (model)
Slides 30: DynamicBindingDemo.java (run DynamicBindingDemo)
Slides 31: PolymorphismDemo.java (run PolymorphismDemo)
Slides 32: BoxedArrayDemo.java (run BoxedArrayDemo)
Slides 34: CompileTypeDemo.java (run CompileTypeDemo)
Slides 35: CastingDemo.java (run CastingDemo)
Slides 36: PatternMatchingDemo.java (run PatternMatchingDemo)
Slides 37: CastAndNullDemo.java (run CastAndNullDemo)
Slides 39: IdentityDemo.java (run IdentityDemo)
Slides 40, 41: CircleValue.java (model)
Slides 42: EqualityDemo.java (run EqualityDemo)
Slides 43: EqualsOverloadDemo.java (run EqualsOverloadDemo)
Slides 46, 47: TestArrayList.java (run TestArrayList)
Slides 48: ListRemovalDemo.java (run ListRemovalDemo)
Slides 49: ListIterationDemo.java (run ListIterationDemo)
Slides 50: DistinctNumbers.java (run DistinctNumbers)
Slides 51: ListCopyDemo.java (run ListCopyDemo)
Slides 52: ArrayListFromArrayDemo.java (run ArrayListFromArrayDemo)
Slides 53: ArraysAsListDemo.java (run ArraysAsListDemo)
Slides 54: ListSortDemo.java (run ListSortDemo)
Slides 55: ListShuffleDemo.java (run ListShuffleDemo)
Slides 58, 59: MyStack.java (model)
Slides 60: TestStack.java (run TestStack)
Slides 61: EmptyStackDemo.java (run EmptyStackDemo)
Slides 63: access/base/AccessBase.java (model)
Slides 64: access/child/AccessChild.java (model)
Slides 65: access/child/ProtectedAccessDemo.java (run access.child.ProtectedAccessDemo)
Slides 66: access/base/PeerDemo.java (run access.base.PeerDemo)
Slides 67: VisibilityWidenDemo.java (run VisibilityWidenDemo)
Slides 68: FinalRulesDemo.java (run FinalRulesDemo)
Slides 69: PlainProfile.java (model)
Slides 70: BoilerplateDemo.java (run BoilerplateDemo)
Slides 73: StackReverseWords.java (run StackReverseWords)
