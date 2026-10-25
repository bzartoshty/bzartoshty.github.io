COMP 182 - Lecture 07 Sorting (Java 17+)

Compile together in this folder:
  javac --release 17 *.java

Run:
  java BubbleSort
  java SelectionSort
  java InsertionSort
  java MergeSort
  java MergeRunsDemo
  java QuickSort
  java BucketSort
  java RadixSort
  java TreeSort
  java HeapSort
  java StabilityDemo
  java Sort

SortItem is the supporting record. Every other class has a runnable main. Sort runs all nine algorithms on a shared example. BubbleSort, InsertionSort, MergeSort, QuickSort, and RadixSort print traces matching the slide inputs. MergeRunsDemo merges the two displayed sorted runs. StabilityDemo tracks labels on equal keys.

All comparison sorts accept arbitrary int keys. BucketSort requires explicit keyRange 1..1000000 and keys in [0,keyRange); the upper bound is a classroom allocation limit. RadixSort requires nonnegative int keys, including Integer.MAX_VALUE. Both validate keys before changing input. They implement FIFO buckets, as in the deck.

TreeSort returns a new array and preserves duplicates with node counts; the other integer sort methods mutate their input. Trace callbacks receive independent snapshots. Comparator overloads require non-null elements and a valid comparator. The unoptimized recursive QuickSort follows the first-pivot two-cursor pseudocode exactly; it can use linear stack space and exhaust the Java stack on deep unbalanced inputs. randomizedSort shuffles distinct keys for the expected-case illustration; it does not fix duplicate-heavy splits.

The merge-sort figure and the executable choose different sides for the extra item of an odd-sized split. The executable follows slide 10 half-open pseudocode. Both preserve stable sorted results.

Keep this folder next to Lecture07_Sorting_Linked.pptx for local source links. Keep this lecture separate from other lecture folders when compiling, since common class names can repeat.

MergeSort.main prints both the ordinary half-open pseudocode trace and sortLikeFigure, which reproduces the figure's left-heavy odd splits.
