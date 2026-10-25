COMP 182 - Sets and Maps (Java 17+)

Compile all files together in this folder:
  javac --release 17 *.java

Run examples:
  java TestMyHashSet
  java TestHashSet
  java TestLinkedHashSet
  java TestTreeSet
  java SetOperations
  java EqualityDemo
  java TestMyHashMap
  java TestMap
  java MapViewsDemo
  java NullAndFactoriesDemo
  java CountOccurrenceOfWords
  java MultimapDemo
  java CountKeywords
  java SetMembershipQuiz

The two counters also accept a UTF-8 text/source file path as their first argument.

CountKeywords is a teaching scanner for Java 17 reserved keywords: it skips comments, string/character literals and text blocks, but is not a compiler. It rejects raw Unicode escapes; contextual words such as record and var, and literals true/false/null, are not counted. Input is assumed to be lexically valid Java except for the scanner demonstration.

Word counting lowercases with Locale.ROOT, splits on non-letter/non-digit characters, and treats apostrophes and hyphens as boundaries. It does not perform Unicode normalization or linguistic word segmentation.

MySet/MyMap are teaching interfaces, not java.util.Set/Map. The separate-chaining implementations reject null keys/elements/values, return null for an absent map key, and grow automatically. Their keySet, values, entrySet and iterator are unmodifiable independent snapshots. JDK Map collection methods are backed views; that distinction is taught explicitly in the slides. values preserves repeated values.

Keep this folder beside Lecture13_SetMap_Enhanced.pptx for local links. Print Notes Pages from PowerPoint for slide thumbnails and notes. The PDF contains slides only. Keep this lecture separate from the hashing lecture when compiling; both contain a teaching class named MyHashMap.
