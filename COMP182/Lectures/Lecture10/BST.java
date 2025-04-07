import java.util.*;

public class BST<E extends Comparable<E>> implements Tree<E>{
  protected TreeNode<E> root;
  protected int size;
 


  /** Create a default BST  */
  public BST() {
    root = null;
    size = 0;
  }

 public boolean insertRecrusive(E e) {
	 if(root == null) {
		 root = createNewNode(e);
		 size++;
		 return true;
	 }
	 else
	  return insertRecursive(e, root);
 }
 
 private boolean insertRecursive(E e, TreeNode<E> curr) {
	 if(e.compareTo(curr.element)<0) {
		 if(curr.left == null) {
			 curr.left = createNewNode(e);
			 size++;
			 return true;
		 }
		 return insertRecursive(e,curr.left);
	 }
	 else if(e.compareTo(curr.element)>0) {
		 if(curr.right == null) {
			 curr.right = createNewNode(e);
			 size++;
			 return true;
		 }
		 else
			 return insertRecursive(e,curr.right); 
	 }
	 else
		 return true;
 }

  /** Create a binary tree from an array of objects */
  public BST(E[] objects) {
   
    for (int i = 0; i < objects.length; i++)
      insert(objects[i]);
  }

  public boolean search(E e) {
    TreeNode<E> current = root; // Start from the root

    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else // element matches current.element
        return true; // Element is found
    }

    return false;
  }
  
  public boolean find(E e) {
	  return find(e,root);
  }
  
  protected boolean find(E e, TreeNode<E> current) {
	  if(current==null)
		  return false;
	  else if(current.element.equals(e))
		  return true;
	  else if(e.compareTo(current.element)<0)
		  return find(e,current.left);
	  else
		  return find(e,current.right);
		  
  }

  public boolean insert(E e) {
    if (root == null)
      root = createNewNode(e); // Create a new root
    else {
      // Locate the parent node
      TreeNode<E> parent = null;
      TreeNode<E> current = root;
      while (current != null)
        if (e.compareTo(current.element)< 0) {
          parent = current;
          current = current.left;
        }
        else if (e.compareTo(current.element) > 0) {
          parent = current;
          current = current.right;
        }
        else
          return false; // Duplicate node not inserted

      // Create the new node and attach it to the parent node
      if (e.compareTo(parent.element) < 0)
        parent.left = createNewNode(e);
      else
        parent.right = createNewNode(e);
    }

    size++;
    return true; // Element inserted successfully
  }

  protected TreeNode<E> createNewNode(E e) {
    return new TreeNode<>(e);
  }
  
  /** Return the height of this binary tree */
  public int height() {
	  
	  return height(root);
	 
  }
  
  private int height(TreeNode<E> root) {
	  if(root==null)
		  return 0;
	  else return 1+Math.max(height(root.left),height(root.right));
  }
  
  public int getHeight() {
	  return getHeight(root);
  }
  
  public int getHeight(TreeNode<E> root) {
	  // left as ecercise
		int height=0;
		return height;
	}
  
  /** BreadthFirstSearch traversal from the root */
  public  void breadthFirstTraversal() {
	  // Left as an exercise
	  Queue<TreeNode<E>> q = new LinkedList<>();
	  LinkedList<TreeNode<E>> list = new LinkedList<>();
	  if(root == null)
		  return;
	  q.add(root);
	  while(!q.isEmpty()) {
		  TreeNode<E> node = q.remove();
		  list.add(node);
		  if(node.left != null)
			  q.add(node.left);
		  if(node.right != null)
			  q.add(node.right);
	  }
	  System.out.println(list);
		  
	  }
	 
	  
  
  
  

  public void inorder() {
    inorder(root);
  }

  /** Inorder traversal from a subtree */
  protected void inorder(TreeNode<E> root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.element + " ");
    inorder(root.right);
  }
  
  /** Non-Recursive  Inorder traversal from the root */
  public void nonRecursiveInorder() {
	  Stack<TreeNode<E>> s = new Stack<>();
	  LinkedList<TreeNode<E>> list = new LinkedList<>();
	  if(root == null) {
		  return;
	  }
	  s.push(root);
	  while(!s.isEmpty()) {
		  TreeNode<E> node = s.peek();
		  if(node.left != null &&  !list.contains(node.left))
			  s.push(node.left);
		  else {
			  list.add(s.pop());
			  if(node.right != null)
				  s.push(node.right);
		  }
	  }
	 // for(int i=0;i<list.size();++i)
	//	  System.out.print(list.get(i).element+" ");
	  System.out.println(list);
  }



  public void postorder() {
    postorder(root);
  }

  /** Postorder traversal from a subtree */
  protected void postorder(TreeNode<E> root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.element + " ");
  }
  
  /** Non-Recursive Postorder traversal from the root*/
  public void nonRecursivePostorder() {
	  Stack<TreeNode<E>> s = new Stack<>();
	  LinkedList<TreeNode<E>> list = new LinkedList<>();
	  if(root == null) {
		  return;
	  }
	  s.push(root);
	  while(!s.isEmpty()) {
		  TreeNode<E> node = s.peek();
		  if(node.left != null && !list.contains(node.left))
			  s.push(node.left);
		  else if(node.right != null && !list.contains(node.right)) {
			  s.push(node.right);
		  }
		  else {
			  list.add(s.pop());
		  }
	  }
	 /* for(int i=0;i<list.size();++i) {
		  System.out.print(list.get(i).element+" ");	  
	  }
	  */
	  System.out.println(list);
  }



  public void preorder() {
    preorder(root);
  }

  /** Preorder traversal from a subtree */
  protected void preorder(TreeNode<E> root) {
    if (root == null) return;
    System.out.print(root.element + " ");
    preorder(root.left);
    preorder(root.right);
  }
  
  /**NoRecursive  Preorder traversal from the root*/
  public void nonRecursivePreorder() {
	  // Left as Exercise
	  Stack<TreeNode<E>> stack = new Stack<>();
	  LinkedList<TreeNode<E>> list = new LinkedList<>();
	  if(root == null)
		  return;
	  stack.push(root);
	  while(!stack.isEmpty()) {
		  TreeNode<E> node = stack.pop();
		  list.add(node);
		  if(node.right!=null)
			  stack.push(node.right);
		  if(node.left != null)
			  stack.push(node.left);
	  }
	  System.out.println(list);
	    
	  }



  

  public int getSize() {
    return size;
  }

  /** Returns the root of the tree */
  public TreeNode<E> getRoot() {
    return root;
  }

  /** Returns a path from the root leading to the specified element */
  public java.util.ArrayList<TreeNode<E>> path(E e) {
    java.util.ArrayList<TreeNode<E>> list =
      new java.util.ArrayList<>();
    TreeNode<E> current = root; // Start from the root

    while (current != null) {
      list.add(current); // Add the node to the list
      if (e.compareTo(current.element)< 0) {
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        current = current.right;
      }
      else
        break;
    }

    return list; // Return an array list of nodes
  }

  public boolean delete(E e) {
    // Locate the node to be deleted and also locate its parent node
    TreeNode<E> parent = null;
    TreeNode<E> current = root;
    while (current != null) {
      if (e.compareTo(current.element) < 0) {
        parent = current;
        current = current.left;
      }
      else if (e.compareTo(current.element) > 0) {
        parent = current;
        current = current.right;
      }
      else
        break; // Element is in the tree pointed at by current
    }

    if (current == null)
      return false; // Element is not in the tree

 // Case 1: current has no left child
    if (current.left == null) {
      // Connect the parent with the right child of the current node
      if (parent == null) {
        root = current.right;
      }
      else {
        if (e.compareTo(parent.element) < 0)
          parent.left = current.right;
        else
          parent.right = current.right;
      }
    }
    else {
      // Case 2: The current node has a left child
      // Locate the rightmost node in the left subtree of
      // the current node and also its parent
      TreeNode<E> parentOfRightMost = current;
      TreeNode<E> rightMost = current.left;

      while (rightMost.right != null) {
        parentOfRightMost = rightMost;
        rightMost = rightMost.right; // Keep going to the right
      }

      // Replace the element in current by the element in rightMost
      current.element = rightMost.element;

      // Eliminate rightmost node
      if (parentOfRightMost.right == rightMost)
        parentOfRightMost.right = rightMost.left;
      else
        // Special case: parentOfRightMost == current
        parentOfRightMost.left = rightMost.left;     
    }
    /*	
    	 // Case 2: The current node has a left child
        // Locate the leftmost node in the right subtree of
        // the current node and also its parent
        TreeNode<E> parentOfLeftMost = current;
        TreeNode<E> leftMost = current.right;

        while (leftMost.left != null) {
          parentOfLeftMost = leftMost;
          leftMost = leftMost.left; // Keep going to the left
        }

        // Replace the element in current by the element in leftMost
        current.element = leftMost.element;

        // Eliminate rightmost node
        if (parentOfLeftMost.left == leftMost)
          parentOfLeftMost.left = leftMost.right;
        else
          // Special case: parentOfRightMost == current
          parentOfLeftMost.right = leftMost.right;     
      }
*/
    size--;
    return true; // Element deleted successfully
  }
  

  
  public void clear() {
    root = null;
    size = 0;
  }



  public java.util.Iterator<E> iterator() {
    return new InorderIterator();
  }

  // Inner class InorderIterator
  private class InorderIterator implements java.util.Iterator<E> {
    // Store the elements in a list
    private java.util.ArrayList<E> list =
      new java.util.ArrayList<>();
    private int current = 0; // Point to the current element in list

    public InorderIterator() {
      // Left as Exercise
    	
    }

    

    @Override /** More elements for traversing? */
    public boolean hasNext() {
      // Left as exercise
      return true;
    }

    @Override /** Get the current element and move to the next */
    public E next() {
     // Left as execise
    	return null;
    }

    
  }



/** This inner class is static, because it does not access 
any instance members defined in its outer class */
private static class TreeNode<E>  {
protected E element;
protected TreeNode<E> left;
protected TreeNode<E> right;

public TreeNode(E e) {
element = e;
}

public String toString() {
	return element.toString();
}
}





}

