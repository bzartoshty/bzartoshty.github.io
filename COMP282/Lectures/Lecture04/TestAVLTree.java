import java.util.*;
import java.util.Arrays;

public class TestAVLTree {


    // TODO Auto-generated method stub
    public static void main(String[] args) {
        new TestAVLTree();
    }

    public TestAVLTree() {

        AVLTree<Integer> tree = new AVLTree<>();
        tree.add(100);
        tree.add(150);
        tree.add(50);
        tree.add(35);
        tree.add(45);
        tree.add(16);
        tree.add(1);
        tree.add(52);
        tree.add(51);
        tree.add(44);
        tree.add(42);
        tree.add(33);
        tree.add(66);
        tree.add(120);
        tree.add(7);
        tree.add(77);
        tree.add(44);
        tree.add(66);

        tree.preorder();

        System.out.println();
        tree.remove(100);
        tree.remove(52);
        tree.remove(51);
        tree.remove(40);
        tree.preorder();
    }



}


