package com.tonyandrys.ds;

/**
 * com.tonyandrys.ds - IntegerBST
 *
 * @author Tony Andrys
 *         Created: 10/18/2013
 */

/**
 * Implementation of a Binary Search Tree which supports nodes with integer keys.
 */
public class IntegerBST {

    Node root; // root node
    Node n; // current node

    /**
     * Constructs an empty BST.
     */
    public IntegerBST() {
        root = null;
        n = null;
    }

    /**
     * Constructs a BST with a root node set to the passed value.
     * @param rootKey int data value to assign to root node
     */
    public IntegerBST(int rootKey) {
        root = new Node(rootKey);
    }

    /**
     * Recursively inserts a new node with passed key in the appropriate position on the BST.
     * @param n parent node
     * @param x integer key to insert
     */
    public void insertNode(Node n, int x) {

        if (x < n.key) {
            /* If the key to insert is less than the vale of this node,
               it needs to be inserted to the left of this node. */
            if (n.left == null) {
                // If no left child of this node exists, set this node's left child to a new node with value x.
                n.left = new Node(x);
            } else {
                // If there is a left child of this node, traverse left.
                insertNode(n.left, x);
            }
        } else if (x > n.key) {
            /* If the key to insert is greater than the vale of this node,
               it needs to be inserted to the right of this node. */
            if (n.right == null) {
                n.right = new Node(x);
            } else {
                // If there is a right child of this node, traverse right.
                insertNode(n.right, x);
            }
        } else {
            System.out.println("Duplicate key detected! Discarding " + x + ".");
        }

    }


    class Node {
        public Node left; // Points to the root node of the left subtree
        public Node right; // Points to the root node of the right subtree
        public Node parent; // Points to the parent of this node
        public int key; // Integer value associated with this node

        /**
         * Creates an empty leaf node.
         */
        public Node() {
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        /**
         * Creates a leaf node with an associated key.
         * @param key data int value
         */
        public Node(int key) {
            this.left = null;
            this.right = null;
            this.parent = null;
            this.key = key;
        }
    }
}


