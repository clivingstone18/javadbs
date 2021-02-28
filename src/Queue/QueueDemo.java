package Queue;

public class QueueDemo<T> {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.addToBack("item11111");
        q.addToBack("anotherItem");
        q.addToBack("thirdItem");

        q.addToBack("4thitem");
        q.addToBack("5thitem");

        q.addToBack("10thitem");


        while (!q.isEmpty()) {
            System.out.println(q.whoIsNext());
            q.removeFront();
        }

    }



}
