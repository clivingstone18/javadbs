package DoublyLinkedList;

public class DoublyLinkedList<T> {
    private class TwoWayNode {
        private T item;
        private TwoWayNode previous;
        private TwoWayNode next;

        public TwoWayNode(T newItem, TwoWayNode previousNode, TwoWayNode nextNode) {
            item = newItem;
            previous = previousNode;
            next = nextNode;
        }
    }
    // iterator

    public class DoublyLinkedIterator {
        private TwoWayNode position = null;

        public DoublyLinkedIterator() {
            position = head;
        }

        public void restart() {
            position = head;
        }

        public boolean hasNext() {
            return (position != null);
        }

        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            } else {
                T toReturn = position.next.item;
                position = position.next;
                return toReturn;
            }
        }

        public void insertHere(T newData) {
            if (position == null && head != null) {
                // add to the end
                TwoWayNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new TwoWayNode(newData, temp, null);
            } else if (head == null || position.previous == null) {
                // head of the list;
                DoublyLinkedList.this.addToStart(newData);
            } else {
                TwoWayNode temp = new TwoWayNode(newData, position.previous, position);
                position.previous.next = temp;
                position.previous = temp;
            }
        }

        public void delete() {
            if (position == null) {
                throw new IllegalStateException();
            }
            if (position.previous == null) {
                // Delete the first node
                head = head.next;
                position = head;
            }
            if (position.next == null) {
                // at the end of the linked list
                position.previous.next = null;
                position = null;
            } else {
                // deleting in the middle of the list
                position.previous.next = position.next;
                position.next.previous = position.previous;
                position = position.next;
            }
        }

    }

    private TwoWayNode head;

    public DoublyLinkedList() {
        head = null;
    }

    public void addToStart(T newItem) {
        TwoWayNode newHead = new TwoWayNode(newItem, null, head.next);
        if (head == null) {
            head = newHead;
        } else {
            head.previous = newHead;
        }
    }
}