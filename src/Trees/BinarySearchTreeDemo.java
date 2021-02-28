package Trees;

public class BinarySearchTreeDemo {
    public static void main (String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add("a");
        tree.add("cat");
        tree.add("dog");
        tree.add("igloo");
        tree.add("zabababa");
        tree.showElements();
    }
}
