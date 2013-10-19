/**
 * com.tonyandrys.ds - Main
 *
 * Used for testing the enclosed data structures.
 *
 * @author Tony Andrys
 *         Created: 10/18/2013
 *         (C) 2013 - Tony Andrys
 */

package com.tonyandrys.ds;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("About to build a SLL.");
        IntegerLinkedList ll = new IntegerLinkedList(10);
        ll.appendValue(11);
        ll.appendValue(12);
        ll.appendValue(3);
        ll.appendValue(0);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());

        ll.removeValue(5);



    }
}
