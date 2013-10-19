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
     * Inserts a integer key in the appropriate place on the BST.
     * @param key integer key to insert
     */
    public void insertKey(int key) {

        // If no root node exists, this key becomes the root node.
        if (root == null) {
            root = new Node(key);
        }

        // If a root node exists, this key can either be less than, greater
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


