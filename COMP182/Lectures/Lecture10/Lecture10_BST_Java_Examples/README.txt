COMP 182 - Binary Search Trees (Java 17 or later)

Compile all files together in this folder:
  javac --release 17 *.java

Runnable examples:
  java TestBST
  java SearchDemo
  java InsertionDemo
  java TraversalDemo
  java DeletionDemo
  java IteratorDemo
  java TreeSort
  java ExpressionTreeDemo
  java BSTPractice
  java HeightDemo
  java OrderingEqualityDemo

Node, Tree, and BST are supporting classes. BST contains the actual slide methods plus complete traversal, strict-neighbor, height, and iterator operations. Printing inorder and levelOrder are the slide versions; list helpers return results for convenient comparison. Node members are package-private for the lesson. BST requires non-null, comparison-stable keys and rejects compareTo-equal duplicates. The iterator is lazy, fail-fast for structural changes, and does not support remove. Recursive helpers can exhaust the Java stack on very deep unbalanced trees.

TreeSort is a separate counted-node implementation that preserves duplicates. BSTPractice validates an acyclic linked binary tree with strict ancestor bounds; it assumes no cycles or shared child nodes. All files use the default package and should remain together.

Keep this folder next to Lecture10_BST_Linked.pptx for the relative source links. Print Notes Pages from PowerPoint for the teaching notes. The PDF contains slides only.
