package LinkedListGeneric;
import java.util.NoSuchElementException;

public class LinkedListGeneric<T> {

    private class Node<T> {
        private T item;
        private Node link;

        public Node() {
            item = null;
            link = null;
        };

        public Node(T data, Node<T> linkValue) {
            item = data;
            link = linkValue;
        };
    }

    public class LinkedListGenericIterator {
        private Node<T> position;
        private Node<T> previous;
        public LinkedListGenericIterator() {
            position=head;
            previous=null;
        }
        public void restart() {
            position=head;
            previous=null;
        }
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            };
            T toReturn = position.item;
            previous = position;
            position = position.link;
            return toReturn;

        }
        public boolean hasNext() {
            return (position != null);
        }

        public T peek() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }
            return position.item;
        }

        public void addHere(T newData) {
            if (position == null && previous != null) {
                previous.link = new Node(newData, null);
            }
            else if (position == null || previous == null) {
                LinkedListGeneric.this.addToStart(newData);
            }
            else {
                Node<T> temp = new Node(newData, position);
                previous.link = temp;
                previous = temp;
            }
        }

        public void addAfterHere(T newData) {
            if (position == null) {
                return;
            }
            Node<T> addHere = position.link;
            Node<T> newNode = new Node(newData, addHere);
            position.link = newNode;



        }


        public void changeHere(T newData) {
            // changes item
            if (position == null) {
                return;
            }
            else {
                position.item = newData;
            }
        }

        public void delete() {
            System.out.println("Hello new method");
            if (position == null) {
                throw new IllegalStateException();
            }
            if (position == head) {
                head = head.link;
                position = head;
                return;
            }
            Node<T> temp = head;
            while (temp != null) {
                if (temp.link == position) {
                    // then we delete
                    temp.link = position.link;
                    position = position.link;
                    return;
                }
                temp = temp.link;
            }
        }
    }

    private Node<T> head;

    public LinkedListGeneric() {
        head = null;
    }

    ;

    public void addToStart(T newItem) {
        head = new Node<T>(newItem, head);
    }

    ;

    public boolean deleteHeadNode() {
        if (head != null) {
            head = head.link;
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        Node<T> position = head;
        int count = 0;
        while (position != null) {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(T item) {
        return (find(item) != null);
    }

    public LinkedListGenericIterator iterator() {
        return new LinkedListGenericIterator();
    }

    ;

    public Node<T> find(T target) {
        Node<T> position = head;
        while (position != null) {
            if (position.item.equals(target)) {
                return position;
            }
            position = position.link;
        }
        return null;
    }

    public T findData(T item) {
        Node<T> node = find(item);
        if (node != null) {
            if (node.item != null) {
                return node.item;
            }
            return null;
        }
        return null;
    }

    public void outputList() {
        Node<T> position = head;
        while (position != null) {
            System.out.println(position.item);
            position = position.link;
        }
    }

    // checks if two lists are equal
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            LinkedListGeneric<T> otherList = (LinkedListGeneric<T>) otherObject;
            // use
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null) {
                if (!position.item.equals(otherPosition.item)) {
                    return false;
                }
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true;
        }
    }
}

