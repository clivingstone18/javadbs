package Stack;

public class Stack<T> {
    private class Node {
        private T item;
        private Node link;

        public Node() {
            item = null;
            link = null;
        }

        public Node(T newItem, Node linkValue) {
            item = newItem;
            link = linkValue;
        }

    }

    private Node head;

    public Stack() {
        head = null;
    }

    public void push(T itemName) {
        head = new Node(itemName, head);
    }

    public T pop() {
        if (head == null) {
            throw new IllegalStateException();
        } else {
            T returnItem = head.item;
            head = head.link;
            return returnItem;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }
}
