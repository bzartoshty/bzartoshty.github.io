/** This inner class is static, because it does not access
 any instance members defined in its outer class */
public  class TreeNode<E>  {
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
