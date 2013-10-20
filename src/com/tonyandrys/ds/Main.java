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
        IntegerLinkedList ll = new IntegerLinkedList(1);
        ll.appendValue(2);
        ll.appendValue(4);
        ll.appendValue(6);
        ll.appendValue(8);
        ll.appendValue(10);
        ll.appendValue(12);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());
        System.out.println("--------------------");
        System.out.println("Trying to remove the first node in the list (1).");
        ll.removeValue(1);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());
        System.out.println("--------------------");
        System.out.println("     ");
        System.out.println("--------------------");
        System.out.println("Trying to remove a middle node in the list (6).");
        ll.removeValue(6);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());
        System.out.println("--------------------");
        System.out.println("     ");
        System.out.println("--------------------");
        System.out.println("Trying to remove the last node in the list (12).");
        ll.removeValue(12);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());
        System.out.println("--------------------");




        ll.removeValue(3);
        ll.printList();
        System.out.println("The size of the linked list is: " + ll.getLength());
    }
}
