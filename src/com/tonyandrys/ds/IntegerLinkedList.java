package com.tonyandrys.ds;

/**
 * com.tonyandrys.ds - IntegerLinkedList
 *
 * @author Tony Andrys
 *         Created: 10/19/2013
 */

/**
 * Singly linked list implementation with support for integer data.
 * List items are stored and referenced in a 0-indexed manner.
 *
 *  ----------------------------------
 * | Example: Linked List of length 3 |
 *  ----------------------------------
 *
 *          –––         –––        –––
 *         | 1 | --->  | 5 | ---> | 8 | ---> NULL
 *          ———         ———        –––
 * Index:    0           1          2
 *
 */
public class IntegerLinkedList {

    private final String NULL = "NULL";
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
     *
     * Time complexity: O(N)
     *
     * @param x int to insert
     */
    public void appendValue(int x) {

        /* Ensure a head node exists before attempting to traverse. If no head node exists,
        create it and do nothing else. */
        if (head == null) {
            head = new Node(x);
        } else {

            /* If a head node exists, we have to traverse the entire list to find the last element, then tack the node
            to attach to the end of the list. */
            Node n = head;

            // Traverse to the end of the list.
            while (n != null) {

                /* If this node's link field points to null, it is the
                end of the list. Therefore, we must break and add a new node. */
                if (n.link == null) {
                    break;
                } else {
                    /* If this node's link field points to another node, keep traversing. */
                    n = n.link;
                }
            }

            /* The loop breaks when n is set to the last node in the list, so modify n's link field to point to the newly
            created node. */
            n.link = new Node(x);
            length++;
        }

    }

    /**
     * Removes the item with integer data x from the linked list. The removal process takes three different cases,
     * outlined below.
     *
     * CASE 1: The head node is the node to delete. No traversal is necessary-- just set the head to
     * the list to be the second node in the list.
     *
     * CASE 2: Node to remove exists somewhere between two nodes in the list. This requires linking the
     * predecessor of the doomed node to the successor of the doomed node.
     *
     * Example: If 2 is to be removed, link 1 and 3 together and let 2 be sucked up by the garbage collector.
     *  ---        ---         ---       ---
     * | 1 | -    | 2 |    -> | 3 | --> | 4 |
     *  ---   |    ---    |    ---       ---
     *        |___________|
     *
     * [The linked list now has a length of 3.]
     *
     * CASE 3: Node to remove is at the end of the list.
     *
     * Time complexity:
     * O(N) - If the node with data x is at the end of the linked list, then we have to traverse the entire list
     * of length N to remove it.
     * Ω(1) - If the node with data x is the first item in the list (or the head element), we perform no traversal,
     * which makes this a constant time operation.
     *
     * @param x integer data field of node to remove
     */

   public void removeValue(int x) {
        if (head == null) {
            System.out.println("SLL: No elements to remove!");
        } else {

            Node curr = head;
            Node prev = null;

            /* Handle case 1. */
            if (head.data == x) {
                System.out.println("SLL: Head node is doomed. New head has value: " + head.link.data);
                head = head.link;
                length--;
            } else {

                /* Cases 2 and 3 are handled within the while loop. */
                while (curr != null) {

                    // If we encounter the value to remove, relink.
                    if ((curr.data == x) && (curr.link != null)) {
                        System.out.println("SLL: Middle node is doomed. Linking " + prev.data + " to " + curr.link.data);
                        prev.link = curr.link;
                        length--;
                        break;
                    } else if ((curr.data == x) && (curr.link == null)) {

                        // The node to remove is the tail. Update the predecessor to point to null.
                        System.out.println("SLL: Tail node is doomed. Linking " + prev.data + " to NULL.");
                        prev.link = null;
                        length--;
                        break;
                    }

                    prev = curr; // Before iterating again, set the node that was just visited as the previous node
                    curr = curr.link; // Then set the next node in the list to be the node we are about to visit
                }
            }
        }
    }

    /**
     * Returns the number of elements currently stored in this linked list.
     * Time complexity: O(1)
     * NOTE: Some implementations choose to traverse the entire list instead of simply storing the current count. In
     * this case, the time complexity would be the same as traversing the whole list (to count every element, or O(N).
     *
     * @return size of linked list as an integer
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Prints the contents of the linked list to the console.
     * Time complexity: O(N)
     */
    public void printList() {
        if (head == null) {
            System.out.println("SLL: No elements to print!");
        } else {

            Node n = head;

            // Final output is stored here. String will be built on every traversal.
            String output = "";

            while (n != null) {
                /* While there exists nodes to traverse, append the contents of the node and an arrow to point to the
                next list item. */
                output += n.data + " --> ";
                if (n.link == null) {
                    break;
                } else {
                    n = n.link;
                }
            }

            /* When the while loop breaks, we are at the end of the list.
            Append NULL to signify the end of the list and print the collected output. */
            output += NULL;
            System.out.println(output);
        }
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
