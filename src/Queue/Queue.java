package Queue;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public Queue() {
        front = null;
        back = null;
    }

    public void addToBack(T newItem) {
        if (!isEmpty()) {
            Node<T> node = new Node<T>(newItem, null);
            back.link = node;
            back = node;
        }
        else {
            front = new Node<T>(newItem, null);
            back = front;
        }
    }

    public boolean isEmpty() {
        return front == null;

    }

    public void clear() {
        front = null;
        back = null;
    }

    public T whoIsNext() {
        if (front != null) {
            return front.item;
        }
        return null;
    }

    public boolean removeFront() {
        if (front != null) {
            front = front.link;
            return true;

        }
        return false;

    }
    private class Node<T> {
        private T item;
        private Node link;

        public Node() {
            item = null;
            link = null;
        }

        public Node(T newItem, Node newNode) {
            item = newItem;
            link = newNode;
        }
    }


}
