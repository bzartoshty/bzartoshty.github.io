COMP 182 - Binary Search Trees (Java 17 or later)

Compile all files together:
  javac --release 17 *.java

Run TestBST, SearchDemo, InsertionDemo, TraversalDemo, DeletionDemo,
IteratorDemo, TreeSort, ExpressionTreeDemo, BSTPractice, HeightDemo,
or OrderingEqualityDemo.

BinarySearchTree.java is the tree implementation. Keep Node.java and Tree.java
in the same folder. The class rejects compareTo-equal duplicate keys.
Traversal methods print directly. path returns nodes visited during search.
containsRecursive takes the starting node and key.
height counts levels: an empty tree has 0 levels and a leaf has 1.
The iterator takes an inorder snapshot and supports remove after next.
Recursive operations can exhaust the stack on deeply unbalanced trees.

TreeSort is a separate counted-node implementation preserving duplicates.
BSTPractice checks strict ancestor bounds for an acyclic linked binary tree.

Keep this folder next to the PowerPoint for relative source links.
Print Notes Pages from PowerPoint for teaching notes.
