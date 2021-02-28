package Set;

public class Set<T> {
    private class Node<T> {
        private T item;
        private Node<T> link;

        public Node() {
            item = null;
            link = null;
        }
        public Node(T newData, Node<T> linkValue) {
            item = newData;
            link = linkValue;
        }
    }
    private Node<T> head;
    public Set() {
        head = null;
    }
    public boolean add(T newItem) {
        if (!contains(newItem)) {
            head = new Node<T>(newItem, head);
            return true;
        }
        return false;
    }

    public boolean contains(T newItem) {
        Node<T> position = head;
        while (position != null) {
            if (! position.item.equals(newItem)) {
                position = position.link;
            }
            return true;
        }
        return false;
    }

    public void output() {
        Node<T> position = head;
        while (position != null) {
            System.out.println(position.item);
            position = position.link;
        }
    }

    public Set<T> union(Set<T> otherSet) {
        Set<T> unionSet = new Set<T>();
        Node<T> position = head;
        while (position != null) {
            unionSet.add(position.item);
            position = position.link;
        }
        position = otherSet.head;
        while (position != null) {
            unionSet.add(position.item);
            position = position.link;
        }
        return unionSet;
    }

    public Set<T> intersection(Set<T> otherSet) {
        Set<T> interSet = new Set<T>();
        Node<T> position = head;
        while (position != null) {
            // only add whats in both
            if (otherSet.contains(position.item)) {
                interSet.add(position.item);
                position = position.link;
            }
        }
        return interSet;
    }

    public Set<T> difference(Set<T> otherSet) {
        Set<T> interSet = new Set<T>();
        Node<T> position = head;
        while (position != null) {
            // only add whats in both
            if (!otherSet.contains(position.item)) {
                interSet.add(position.item);
                position = position.link;
            }
        }
        return interSet;
    }


}
