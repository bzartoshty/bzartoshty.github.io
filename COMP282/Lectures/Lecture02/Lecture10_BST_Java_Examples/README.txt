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
Depth counts edges from the root (root depth 0). Level = depth + 1.
For a nonempty tree, height = maximum depth + 1.
Height recurrence: height(null) = 0; height(node) = 1 + max(child heights).
For n >= 1 nodes: ceil(log2(n + 1)) <= height <= n.
For integer height h >= 0: maximum nodes = 2^h - 1.
At level L >= 1: maximum nodes = 2^(L - 1).
For h >= 1: maximum leaves = 2^(h - 1); an empty tree has 0 leaves.
Search/insert/delete use O(h) time for a nonempty tree, O(1) if empty.
Computing height visits all nodes: O(n) time and O(h) stack space when nonempty.
Run HeightConventionTest to check empty, leaf, chain, balanced, and updated trees.
The iterator takes an inorder snapshot and supports remove after next.
Recursive operations can exhaust the stack on deeply unbalanced trees.

TreeSort is a separate counted-node implementation preserving duplicates.
BSTPractice checks strict ancestor bounds for an acyclic linked binary tree.

Keep this folder next to the PowerPoint for relative source links.
Print Notes Pages from PowerPoint for teaching notes.

