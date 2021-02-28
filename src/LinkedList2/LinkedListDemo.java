package LinkedList2;

import LinkedList2.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        System.out.println("This is the Linked List Demo");
        LinkedList list = new LinkedList();
        list.addToStart("Item1");
        list.addToStart("Item2");
        System.out.println("List has " + list.size( ) + " nodes.");
        System.out.println(list.contains("Item1"));
    }

}