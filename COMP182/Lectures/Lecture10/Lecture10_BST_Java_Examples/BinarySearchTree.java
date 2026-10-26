import java.util.*;

/** An unbalanced binary search tree containing unique comparable keys. */
public class BinarySearchTree<E extends Comparable<E>> implements Tree<E> {
   protected Node<E> root;
   protected int size;

   public BinarySearchTree() {
      root = null;
      size = 0;
   }
   
   public int size() { 
      return size; }


   public BinarySearchTree(E[] objects) {
      this();
      Objects.requireNonNull(objects, "objects");
      for (E key : objects) {
         insert(key);
      }
   }

   /** Returns true if the key is in the tree */
   @Override
   public boolean contains(E key) {
      Objects.requireNonNull(key);
      Node<E> x = root;
      while (x != null) {
         int cmp = key.compareTo(x.key);
         if (cmp < 0) x = x.left;
         else if (cmp > 0) x = x.right;
         else
            return true;
      }
      return false;
   }

   /** Recursiive version: Returns true if the key is in the tree */
   public boolean containsRecursive(Node<E> x, E key) {
      if (x == null)
         return false;
      int cmp = key.compareTo(x.key);
      if (cmp < 0)
         return containsRecursive(x.left, key);
      if (cmp > 0)
         return containsRecursive(x.right, key);
      return true;
   }



   /** Inserts the specified key into the tree. */
   @Override
   public boolean insert(E key) {
      Objects.requireNonNull(key);
      Node<E> parent = null, x = root;
      int cmp = 0;
      while (x != null) {
         parent = x;
         cmp = key.compareTo(x.key);
         if (cmp == 0)
            return false;
         x = cmp < 0 ? x.left : x.right;
      }
      Node<E> node = new Node<>(key);
      if (parent == null) root = node;
      else if (cmp < 0) parent.left = node;
      else parent.right = node;
      size++;
      return true; // Element inserted successfully
   }



   
   protected Node<E> createNewNode(E e) {
      return new Node<>(e);
   }


   public int height() {
      return height(root);
   }

   private int height(Node<E> node) {
      return node == null ? 0 : 1 + Math.max(height(node.left), height(node.right));
   }

  
   public void levelOrder() {
      if (root == null) 
         return;
      Queue<Node<E>> q = new LinkedList<>();
      q.add(root);
      while (!q.isEmpty()) {
         Node<E> x = q.remove();
         System.out.print(x.key+" ");
         if (x.left != null) q.add(x.left);
         if (x.right != null) q.add(x.right);
      }
      System.out.println();
   
   }


  
   public void inorder() {
      inorder(root);
   }

   protected void inorder(Node<E> node) {
      if (node == null) 
         return;
      inorder(node.left);
      System.out.print(node.key + " ");
      inorder(node.right);
   }

 
   public void postorder() {
      postorder(root);
   }

   protected void postorder(Node<E> node) {
      if (node == null) 
         return;
      postorder(node.left);
      postorder(node.right);
      System.out.print(node.key + " ");
   }

  
   public void preorder() {
      preorder(root);
   }

   protected void preorder(Node<E> node) {
      if (node == null) 
         return;
      System.out.print(node.key + " ");
      preorder(node.left);
      preorder(node.right);
   }

  


      
    
   public ArrayList<Node<E>> path(E e) {
      Objects.requireNonNull(e, "key");
      ArrayList<Node<E>> result = new ArrayList<>();
      Node<E> current = root;
      while (current != null) {
         result.add(current);
         int comparison = e.compareTo(current.key);
         if (comparison < 0) current = current.left;
         else if (comparison > 0) current = current.right;
         else 
            break;
      }
      return result;
   }

   @Override
   public boolean delete(E key) {
      Objects.requireNonNull(key);
      if (!contains(key)) 
         return false;
      root = delete(root, key);
      size--;
      return true;
   }


   private Node<E> delete(Node<E> x, E key) {
      if (x == null) 
         return null;
      int cmp = key.compareTo(x.key);
      if (cmp < 0) x.left = delete(x.left, key);
      else if (cmp > 0) x.right = delete(x.right, key);
      else {
         if (x.left == null) 
            return x.right;
         if (x.right == null) 
            return x.left;
         x.key = min(x.right).key;
         x.right = deleteMin(x.right);
      }
      return x;
   }

   private Node<E> min(Node<E> x) {
      while (x.left != null) x = x.left;
      return x;
   }

   private Node<E> deleteMin(Node<E> x) {
      if (x.left == null) 
         return x.right;
      x.left = deleteMin(x.left);
      return x;
   }




   public void clear() {
      root = null;
      size = 0;
   }


   @Override
    public Iterator<E> iterator() {
      return new InorderIterator();
   }

   private class InorderIterator implements Iterator<E> {
      private final ArrayList<E> elements = new ArrayList<>();
      private int cursor;
      private E lastReturned;
      private boolean canRemove;
   
      InorderIterator() {
         inorder(root, elements);
      }
   
      @Override
        public boolean hasNext() {
         return cursor < elements.size();
      }
   
      @Override
        public E next() {
         if (!hasNext()) throw new NoSuchElementException();
         lastReturned = elements.get(cursor++);
         canRemove = true;
         return lastReturned;
      }
   
      @Override
        public void remove() {
         if (!canRemove) throw new IllegalStateException();
         BinarySearchTree.this.delete(lastReturned);
         elements.remove(--cursor);
         canRemove = false;
      }
        
      private void inorder(Node<E> root, ArrayList<E> elements) {
         if(root==null)
            return;
         else {
            inorder(root.left,elements);
            elements.add(root.key);
            inorder(root.right,elements);
         }
      }
   }


      
}
