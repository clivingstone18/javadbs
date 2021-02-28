package LinkedListGeneric;

public class LinkedListGenericDemo {
    public static void main(String[] args) {

        LinkedListGeneric list = new LinkedListGeneric();
        LinkedListGeneric.LinkedListGenericIterator i = list.iterator();

        list.addToStart(1);
        list.addToStart(2);
        list.addToStart(3);
        list.addToStart(5);
        list.addToStart(6);


        System.out.println("List contains");
        i.restart();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();

        i.restart();
        i.next();
        i.next();

        System.out.println("Will delete the node for " + i.peek());
        i.delete();

        i.restart();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
        i.restart();
        i.next();
        System.out.println("Will add one node after " + i.peek( ));
        i.addAfterHere(1999);
        i.next();
        System.out.println("Will add one node after " + i.peek( ));
        i.addAfterHere(2000);


        i.restart();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();



    }



}
