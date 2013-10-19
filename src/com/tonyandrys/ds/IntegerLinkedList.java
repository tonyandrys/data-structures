package com.tonyandrys.ds;

/**
 * com.tonyandrys.ds - IntegerLinkedList
 *
 * @author Tony Andrys
 *         Created: 10/19/2013
 */

/**
 * Singly linked list implementation with support for integer data.
 */
public class IntegerLinkedList {

    int length; // length of linked list
    Node head; // First element in linked list

    /**
     * Constructs an empty linked list
     */
    public IntegerLinkedList() {
        this.length = 0;
        head = null;
    }

    /**
     * Constructs a linked list with one node set to value v.
     * @param v value of first linkedList
     */
    public IntegerLinkedList(int v) {
        this.length = 1;
        this.head = new Node(v);
    }

    /**
     * Adds a new integer, x, to the end of the linked list.
     * Time complexity: O(n)
     * @param x int to insert
     */
    public void insertValue(int x) {
        // TODO: Add root checking, don't assume elements exist! 
        Node n = head;

        // Traverse to the end of the list.
        while (n != null) {
            System.out.println("SLL: Visited node with value: " + n.data);
            n = head.link;
        }
        System.out.println("SLL: Hit the end of the list!");
        n.link = new Node(x);
    }

    class Node {
        public int data; // integer associated with this node
        public Node link; // Link to next node

        // Constructs an empty node.
        public Node() {
            this.link = null;
        }

        // Constructs a node with value v.
        public Node(int v) {
            this.data = v;
            this.link = null;
        }
    }

}
