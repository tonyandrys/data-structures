package com.tonyandrys.ds;

/**
 * com.tonyandrys.ds - IntegerBST
 *
 * @author Tony Andrys
 *         Created: 10/18/2013
 *         (C) 2013 - Tony Andrys
 */

/**
 * Implementation of a Binary Search Tree which supports nodes with integer keys.
 */
public class IntegerBST {

    public IntegerBST() {
        
    }


    class Node {

        Node left; // Points to the root node of the left subtree
        Node right; // Points to the root node of the right subtree
        int parent; // Points to the parent of this node
        int key; // Integer value associated with this node
    }
}


