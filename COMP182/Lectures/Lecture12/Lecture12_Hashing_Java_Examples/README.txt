COMP 182 HASHING JAVA EXAMPLES

Keep Lecture12_Hashing_Java_Examples beside Lecture12_Hashing_Linked.pptx.
Use Ctrl+click in editing view, or click in a slide show, for local Java links.
Print PowerPoint Notes Pages for slide thumbnails with teaching notes.
The separate PDF contains only slides.

With Java 17 or newer, compile from this folder:
  javac -d classes *.java
Run a driver, for example:
  java -cp classes HashCodeExamples
  java -cp classes ProbingPractice
  java -cp classes QuadraticProbingDemo
  java -cp classes DoubleHashingDemo
  java -cp classes ChainingDemo
  java -cp classes TombstoneMapDemo

ProbeTable is a FIXED-CAPACITY integer set for exact classroom probe traces.
It never automatically resizes. A Result index -1 means insertion failure;
inserted=false with an existing index means a duplicate. It bounds every
operation by capacity, even when a quadratic/legacy sequence repeats slots.
DOUBLE_LEGACY is intentionally incorrect as a full-coverage policy and uses
nonnegative keys. DOUBLE_PRIME validates primes q < capacity and supports
signed int keys using floorMod. Failed insertion does not alter live keys.

LinearProbingMap is a complete linear-probing map with tombstones, bounded
lookup, geometric growth, and same-capacity compaction. MyHashMap uses linked
buckets, replacement, deletion, configurable load control, and rehashing.
Both teaching maps reject NULL KEYS AND NULL VALUES; null means MISSING.
java.util.HashMap has different null behavior, shown by JavaHashMapDemo.
Keep equality/hash-relevant key fields stable while stored. PersonKey is an
immutable example. MyHashSet stores one shared non-null marker through a map.
These compact teaching classes are not drop-in java.util.Map implementations.

HashAnalysisExamples prints idealized expected-probe formulas, not measured
worst-case guarantees. HashMixingExamples labels historical/OpenJDK details.

SOURCE AND DRIVER INDEX
Slides 7, 8, 10, 11, 12, 14: HashCodeExamples.java (run this class)
Slides 9, 13: PersonKey.java (supporting class)
Slides 9, 13: PersonKeyDemo.java (run this class)
Slides 5, 6, 41: JavaHashMapDemo.java (run this class)
Slides 16, 19, 20, 25, 28, 30: ProbeTable.java (supporting class)
Slides 17, 18, 19: LinearProbingDemo.java (run this class)
Slides 21, 22, 23, 24: ProbingPractice.java (run this class)
Slides 25, 26, 27: QuadraticProbingDemo.java (run this class)
Slides 28, 29, 30: DoubleHashingDemo.java (run this class)
Slides 31, 32, 34, 35, 42: MyHashMap.java (supporting class)
Slides 31, 32, 33, 34: ChainingDemo.java (run this class)
Slides 35, 42: RehashingDemo.java (run this class)
Slides 43: MyHashSet.java (supporting class)
Slides 43: MyHashSetDemo.java (run this class)
Slides 19, 20, 35: LinearProbingMap.java (supporting class)
Slides 19, 20, 35: TombstoneMapDemo.java (run this class)
Slides 33, 36, 38: HashAnalysisExamples.java (run this class)
Slides 39, 40: HashMixingExamples.java (run this class)
