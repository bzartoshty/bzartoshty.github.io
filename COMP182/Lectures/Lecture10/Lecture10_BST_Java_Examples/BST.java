import java.util.*;
import java.util.function.Consumer;
/** Unbalanced set-style BST; comparison equality defines duplicates. */
public class BST<E extends Comparable<? super E>> implements Tree<E> {
    private Node<E> root;
    private int size;
    private int modifications;
    public int size() { return size; }
public boolean contains(E key) {
    Objects.requireNonNull(key);
    Node<E> x = root;
    while (x != null) {
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x = x.left;
        else if (cmp > 0) x = x.right;
        else return true;
    }
    return false;
}
private boolean contains(Node<E> x, E key) {
    if (x == null) return false;
    int cmp = key.compareTo(x.key);
    if (cmp < 0) return contains(x.left, key);
    if (cmp > 0) return contains(x.right, key);
    return true;
}
public boolean insert(E key) {
    Objects.requireNonNull(key);
    Node<E> parent = null, x = root;
    int cmp = 0;
    while (x != null) {
        parent = x;
        cmp = key.compareTo(x.key);
        if (cmp == 0) return false;
        x = cmp < 0 ? x.left : x.right;
    }
    Node<E> node = new Node<>(key);
    if (parent == null) root = node;
    else if (cmp < 0) parent.left = node;
    else parent.right = node;
    size++;
    modifications++;
    return true;
}
void inorder(Node<E> x) {
    if (x == null) return;
    inorder(x.left);
    visit(x.key);
    inorder(x.right);
}
void levelOrder() {
    if (root == null) return;
    Queue<Node<E>> q = new ArrayDeque<>();
    q.add(root);
    while (!q.isEmpty()) {
        Node<E> x = q.remove();
        visit(x.key);
        if (x.left != null) q.add(x.left);
        if (x.right != null) q.add(x.right);
    }
}
private Node<E> delete(Node<E> x, E key) {
    if (x == null) return null;
    int cmp = key.compareTo(x.key);
    if (cmp < 0) x.left = delete(x.left, key);
    else if (cmp > 0) x.right = delete(x.right, key);
    else {
        if (x.left == null) return x.right;
        if (x.right == null) return x.left;
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
    if (x.left == null) return x.right;
    x.left = deleteMin(x.left);
    return x;
}
public boolean delete(E key) {
    Objects.requireNonNull(key);
    if (!contains(key)) return false;
    root = delete(root, key);
    size--;
    modifications++;
    return true;
}
    public boolean containsRecursive(E key) {
        Objects.requireNonNull(key);
        return contains(root, key);
    }
    private void visit(E key) { System.out.print(key + " "); }
    public void inorder() { inorder(root); System.out.println(); }
    public List<E> inorderKeys() {
        List<E> result = new ArrayList<>();
        for (E key : this) result.add(key);
        return result;
    }
    private void walk(Node<E> x, int order, Consumer<E> action) {
        if (x == null) return;
        if (order == 0) action.accept(x.key);
        walk(x.left, order, action);
        if (order == 1) action.accept(x.key);
        walk(x.right, order, action);
        if (order == 2) action.accept(x.key);
    }
    public List<E> preorderKeys() {
        List<E> result = new ArrayList<>(); walk(root, 0, result::add); return result;
    }
    public List<E> postorderKeys() {
        List<E> result = new ArrayList<>(); walk(root, 2, result::add); return result;
    }
    public List<E> levelOrderKeys() {
        List<E> result = new ArrayList<>();
        Queue<Node<E>> q = new ArrayDeque<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            Node<E> x = q.remove(); result.add(x.key);
            if (x.left != null) q.add(x.left);
            if (x.right != null) q.add(x.right);
        }
        return result;
    }
    public List<E> searchPath(E key) {
        Objects.requireNonNull(key); List<E> result = new ArrayList<>();
        Node<E> x = root;
        while (x != null) {
            result.add(x.key); int cmp = key.compareTo(x.key);
            if (cmp == 0) break;
            x = cmp < 0 ? x.left : x.right;
        }
        return result;
    }
    public int height() {
        Queue<Node<E>> q = new ArrayDeque<>(); int h = -1;
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            int width = q.size(); h++;
            for (int i = 0; i < width; i++) {
                Node<E> x = q.remove();
                if (x.left != null) q.add(x.left);
                if (x.right != null) q.add(x.right);
            }
        }
        return h;
    }
    public Optional<E> predecessor(E key) {
        Objects.requireNonNull(key); Node<E> x = root; E best = null;
        while (x != null) {
            if (key.compareTo(x.key) <= 0) x = x.left;
            else { best = x.key; x = x.right; }
        }
        return Optional.ofNullable(best);
    }
    public Optional<E> successor(E key) {
        Objects.requireNonNull(key); Node<E> x = root; E best = null;
        while (x != null) {
            if (key.compareTo(x.key) >= 0) x = x.right;
            else { best = x.key; x = x.left; }
        }
        return Optional.ofNullable(best);
    }
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private final Deque<Node<E>> stack = new ArrayDeque<>();
            private final int expected = modifications;
            { pushLeft(root); }
            private void pushLeft(Node<E> x) {
                while (x != null) { stack.push(x); x = x.left; }
            }
            private void check() {
                if (expected != modifications) throw new ConcurrentModificationException();
            }
            public boolean hasNext() { check(); return !stack.isEmpty(); }
            public E next() {
                check();
                if (stack.isEmpty()) throw new NoSuchElementException();
                Node<E> x = stack.pop(); pushLeft(x.right); return x.key;
            }
        };
    }
}
