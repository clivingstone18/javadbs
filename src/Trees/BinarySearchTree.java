package Trees;

public class BinarySearchTree<T extends Comparable<T>> {
    private static class TreeNode<T> {
        private TreeNode<T> left;
        private TreeNode<T> right;
        private T item;

        public TreeNode(T newItem, TreeNode newLeft, TreeNode newRight) {
            item = newItem;
            left = newLeft;
            right = newRight;
        }
    }

    private TreeNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(T item) {
        root = insertInSubtree(item, root);
    }

    public boolean contains(T item) {
        return isInSubtree(root, item);
    }

    public void showElements() {
        showElementsInSubtree(root);
    }

    private TreeNode<T> insertInSubtree(T item, TreeNode<T> subTreeRoot) {
        // new
        if (subTreeRoot == null) {
            return new TreeNode(item, null, null);
        } else if (item.compareTo(subTreeRoot.item) < 0) {
            subTreeRoot.left = insertInSubtree(item, subTreeRoot.left);
            return subTreeRoot;
        } else {
            subTreeRoot.right = insertInSubtree(item, subTreeRoot.right);
            return subTreeRoot;
        }
    }

    private boolean isInSubtree(TreeNode<T> subTreeRoot, T item) {
        // base cases
        if (subTreeRoot != null) {
            return false;
        } else if (subTreeRoot.item.equals(item)) {
            return true;
        } else if (item.compareTo(subTreeRoot.left.item) < 0) {
            return isInSubtree(subTreeRoot.left, item);
        } else {
            return isInSubtree(subTreeRoot.right, item);
        }
    }

    private static void showElementsInSubtree(TreeNode root) {
        if (root != null) {
            showElementsInSubtree(root.right);
            System.out.println(root.item);
            showElementsInSubtree(root.left);
        } else {

        }

    }
}