import java.util.*;

import java.io.*;

public class        BinarySearchTree<E extends Comparable<E>> implements Tree<E>{
    protected TreeNode<E> root;
    protected int size;



    /** Create a default BST2  */
    public BinarySearchTree() {
        root = null;
        size = 0;
    }



    /** Create a binary tree from an array of objects */
    public BinarySearchTree(E[] objects) {

        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    @Override /** Returns true if the element is in the tree */
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

    /** Insert element e into the binary tree
     * Return true if the element is inserted successfully */
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

    public boolean insertRecursive(E e) {
        if (root == null) {
            root = new TreeNode<>(e); // Create a new root
            size++;
            return true;
        }
        return insertRecursive(root,e);
    }

    public boolean insertRecursive(TreeNode<E> current, E e) {
        if(e.compareTo(current.element)<0) {
            if(current.left==null) {
                current.left = new TreeNode<>(e);
                size++;
                return true;
            }
            else
                return insertRecursive(current.left,e);
        }
        else if(e.compareTo(current.element)>0) {
            if(current.right==null) {
                current.right = new TreeNode<>(e);
                size++;
                return true;
            }
            else
                return insertRecursive(current.right,e);
        }
        else
            return true; // Element inserted successfully
    }


    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    /** Return the height of this binary tree */
    public int height() {
        // Left as exercise
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
        Queue<TreeNode<E>> q = new LinkedList<>();
        int height = 0;
        // add root to the queue
        q.add(root);
        // add null as marker
        q.add(null);
        while (q.isEmpty() == false) {
            TreeNode<E> n = q.remove();
            // check if n is null, if yes, we have reached to the end of the
            // current level, increment the height by 1, and add the another
            // null as marker for next level
            if (n == null) {
                // before adding null, check if queue is empty, which means we
                // have traveled all the levels
                if(!q.isEmpty()){
                    q.add(null);
                }
                height++;
            }else{
                // else add the children of extracted node.
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
        }
        return height;
    }

    /** Returns the first (lowest) element currently in this BST. */
    public E first() {
        if (root == null)
            return null;
        TreeNode<E> current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.element;
    }

    /** Returns the last (highest) element currently in this BST. */
    public E last() {
        if (root == null)
            return null;
        TreeNode<E> current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.element;
    }

    /** Returns the least element in this set greater than to the given element,
     *   or null if there is no such element.
     */
    public E ceiling(E e) {
        TreeNode<E> parent = findNode(e);
        if(parent==null) {
            System.out.println(e + " is not in the tree");
            return null;
        }
        if (parent.right == null)
            return null;
        TreeNode<E> node = parent.right;
        if(node.left == null){
            return node.element;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.element;
    }

    private TreeNode<E> findNode(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            }
            else if (e.compareTo(current.element) > 0) {
                current = current.right;
            }
            else if(e.compareTo(current.element) == 0){
                return current;
            }
        }
        return null;
    }

    /** Returns the greatest element in this set less than to the given element,
     * or null if there is no such element.
     */
   public E floor(E e) {
       TreeNode<E> parent = findNode(e);
       if(parent==null) {
           System.out.println(e + " is not in the tree");
           return null;
       }
       if (parent.left == null)
           return null;
       TreeNode<E> node = parent.left;
       if(node.right == null){
           return node.element;
       }
       while (node.right != null) {
           node = node.right;
       }
       return node.element;
   }




    /** BreadthFirstSearch traversal from the root */
    public  void breadthFirstTraversal() {
        // Left as an exercise
        java.util.Queue<TreeNode<E>> queue =
                new java.util.LinkedList<TreeNode<E>>();


        if (root == null)
            return ;

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<E> node = queue.poll();

            System.out.print(node.element + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }



    }



    @Override /** Inorder traversal from the root */
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
        System.out.println(list);
    }




    @Override /** Postorder traversal from the root */
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
        System.out.println(list);
    }


    @Override /** Preorder traversal from the root */
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
        return;

    }







    @Override /** Get the number of nodes in the tree */
    public int getSize() {
        return size;
    }

    public int getNumberOfNodes() {
        return getNumberOfNodes(root);
    }

    public int getNumberOfNodes(TreeNode<E> root) {
        if (root == null) return 0;
        return 1 + getNumberOfNodes(root.left) + getNumberOfNodes(root.right);
    }

    /** Returns the root of the tree */
    public TreeNode<E> getRoot() {
        return root;
    }

    public E getElement(TreeNode<E> node) {
        return node.element;
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

    @Override /** Delete an element from the binary tree.
     * Return true if the element is deleted successfully
     * Return false if the element is not in the tree */

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


    @Override /** Remove all elements from the tree */
    public void clear() {
        root = null;
        size = 0;
    }

    public void saveTree(String filename) throws IOException {
        // Left as Exercise
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename));
        saveTree(root,output);
        output.writeObject(null); // to indicate end of tree
        output.close();
    }

    private void saveTree(TreeNode<E> root, ObjectOutputStream output) throws IOException {
        if(root!=null) {

            saveTree(root.left, output);
            output.writeObject(root.element);
            saveTree(root.right, output);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadTree(String filename) throws IOException, ClassNotFoundException {
        // Left as Exercise
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
        ArrayList<E> list = new ArrayList<>();
        while (true) {
            E element = (E) input.readObject();
            if (element == null)
                break;
            list.add(element);
        }
        input.close();
        if (list.size() > 0) {
            root = buildTree(list, 0, list.size() - 1);
            size = list.size();
        }
    }

    private TreeNode<E> buildTree(ArrayList<E> list, int first, int last) {
        if (first > last)
            return null;
        int mid = (first + last) / 2;
        TreeNode<E> left = buildTree(list, first, mid - 1);
        TreeNode<E> node = new TreeNode<>(list.get(mid));
        node.left = left;
        node.right = buildTree(list, mid + 1, last);
        return node;
    }



    @Override /** Obtain an iterator. Use inorder. */
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
            inorder(); // Traverse binary tree and store elements in list
        }

        /** Inorder traversal from the root*/
        private void inorder() {
            inorder(root);
        }

        /** Inorder traversal from a subtree */
        private void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }

        @Override /** More elements for traversing? */
        public boolean hasNext() {
            if (current < list.size())
                return true;

            return false;
        }

        @Override /** Get the current element and move to the next */
        public E next() {
            return list.get(current++);
        }

        @Override // Remove the element returned by the last next()
        public void remove() {
            if (current == 0) // next() has not been called yet
                throw new IllegalStateException();

            list.remove(list.get(--current));

        }
    }

    @SuppressWarnings("unchecked")
    @Override
    /** Returns true if this collection contains all of the elements in the specified collection. */
    public  boolean containsAll(Collection<?> c) {
        for (Object e : c)
            if (!contains(e))
                return false;
        return true;
    }

    /** Adds all of the elements in the specified collection to this tree. */
    public  boolean addAll(Collection<? extends E> c) {
        for (E e : c)
            add(e);
        return true;
    }


    /** Remove all of the elements in the specified collection from this tree. */
    public boolean removeAll(Collection<?> c) {
        for (Object e : c)
            remove(e);
        return true;
    }

    /** Retain all of the elements in the specified collection in this tree. */
    public boolean retainAll(Collection<?> c) {
        for (Object e : this)
            if (!c.contains(e))
                remove(e);
        return true;
    }

    /** Returns true if this tree contains the specified element. */
    public boolean contains(Object e) {
        return search((E)e);
    }

    /** Returns an array containing all of the elements in this collection.
     * this method must return the elements in the same order level-be-level
     */
    public  Object[] toArray() {
        Object[] array = new Object[size];
        ArrayList<E> list = bfs();
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        return array;
    }

    /** Returns an array containing all of the elements in this collection.
     * this method must return the elements in the same order level-be-level
     */
    public E[] toArray(E[] array){
        ArrayList<E> list = bfs();
        for (int i = 0; i < list.size(); i++)
            array[i] = list.get(i);
        return array;
    }

    private  ArrayList<E> bfs() {
        // Left as an exercise
        java.util.Queue<TreeNode<E>> queue =
                new java.util.LinkedList<TreeNode<E>>();
        ArrayList<E> list = new ArrayList<>();

        if (root == null)
            return null;

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<E> node = queue.poll();
            list.add(node.element);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }

        return list;

    }

    // Make a deep copy of this BST
   public BinarySearchTree<E> clone() {

       BinarySearchTree<E> clone = new BinarySearchTree<>();
       clone.addAll(this);
       return clone;

   }
    
    


}
