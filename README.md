data-structures
==========

<b>Written by:</b> Tony Andrys

A collection of various data structures and algorithms implemeneted in Java. Built primarily as an educational exercise for myself, perhaps they can be useful to others as well.

I have tried to write these implementations with a generous amount of comments, illustrations, and included asymptotic time complexity measurements where necessary. For now, these are primarily upper/lower bounds (Big Oh/Omega). For simplicity's sake, they are mostly embedded in javadoc comments (see below):

    /**
     * Removes the item with integer data x from the linked list.
     *
     * Time complexity:
     * O(N) - If the node with data x is at the end of the linked list, then we have to traverse the entire list
     * of length N to remove it.
     * Ω(1) - If the node with data x is the first item in the list (or the head element), we perform no traversal,
     * which makes this a constant time operation.
     *
     * @param x integer data field of node to remove
     */

If they bug you, most IDEs have javadoc folding features. Fold them away and you'll never see them again.

Feel free to use the code in this repository in any matter you see fit-- but please include credit to the author if you choose to republish.

Structures Implemented
----------

*Please note that all implementations only support integers. I'll get around to changing this soon.*

* Containers
	* Stack
	* Queue
* Linked Lists
	* Singly Linked List 
