package LinkedList2;

public class LinkedList {
    private class Node {
        private String item;
        private Node link;

        public Node() {
            item = null;
            link = null;
        }

        public Node(String newItem, Node newNode) {
            item = newItem;
            link = newNode;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addToStart(String item) {
        head = new Node(item, head);
    }

    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.link;
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        int count = 0;
        Node position = head;
        while (position != null) {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(String target) {
        return find(target) != null;

    }

    private Node find(String target) {
        Node position = head;
        while (position != null) {
            if (position.item.equals(target)) {
                return position;
            }
            position = position.link;
        }
        return null;
    }

    public void outputList() {
        Node position = head;
        while (position != null) {
            System.out.println(position.item);
            position = position.link;
        }
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
    }
}