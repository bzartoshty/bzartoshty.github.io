COMP 182 PRIORITY QUEUES AND BINARY HEAPS

Keep Lecture11_PQ_Java_Examples beside Lecture11_PQ_Linked.pptx for local links.
Open PowerPoint File > Print > Notes Pages for printable teaching notes.
The separate PDF contains slides only.

Compile all files together with Java 17 or newer from this folder:
  javac -d classes *.java
Run the five example drivers:
  java -cp classes HeapDemo
  java -cp classes TestPQ
  java -cp classes HeapSortTest
  java -cp classes JavaPriorityQueueDemo
  java -cp classes StablePriorityQueueDemo

MaxHeap and MinHeap reject null entries, use natural comparison, and return
null on empty peek/remove. Constructors copy collection entries and build
bottom up. snapshot copies the list structure but shares element references.
Do not mutate comparison keys while objects remain queued.

MaxPriorityQueue and MinPriorityQueue implement PriorityQueueInterface.
Their boolean add methods adapt the void heap add operation. Equal priority
alone gives no FIFO guarantee. The stable example adds an arrival sequence.
Its sequence values must remain unique and increasing without wraparound.

HeapSort sorts a non-null int[] in place, ascending, with O(1) extra space.
JavaPriorityQueueDemo uses the JDK API: empty poll/peek return null, while
empty remove()/element() throw. Poll repeatedly for priority order; iterator
order is unspecified. Custom course remove has different empty behavior.

Array growth can make one heap insertion O(n); heap repair is O(log n),
and geometric growth gives O(log n) amortized insertion. clear is O(n).
The sift-down loop tests root < size/2 before calculating a child index.

SOURCE INDEX
Slides 3: PriorityQueueInterface.java
Slides 10, 18, 20, 28: MaxHeap.java
Slides 29: MaxPriorityQueue.java
Slides 10: MinHeap.java
Slides 29: MinPriorityQueue.java
Slides 30: HeapSort.java
Slides 30, 31: HeapSortTest.java
Slides 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 28: HeapDemo.java
Slides 3, 29: TestPQ.java
Slides 32: JavaPriorityQueueDemo.java
Slides 2, 32: StablePriorityQueueDemo.java
