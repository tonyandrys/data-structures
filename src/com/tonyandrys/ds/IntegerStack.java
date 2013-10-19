/**
 * com.tonyandrys.ds - Stack
 *
 * @author Tony Andrys
 *         Created: 10/18/2013
 */

package com.tonyandrys.ds;

/**
 * A simple implementation of a stack using an array.
 * Performs LIFO based storage/retrieval of integer values.
 */
public class IntegerStack {

    private int size; // Maximum amount of elements the stack can support.
    private int sp; // Stack pointer
    private int[] storage;

    /**
     * Stack can be constructed to support any amount of elements.
     * @param size max size of stack as int
     */
    public IntegerStack(int size) {
        this.size = size;
        storage = new int[size];
        sp = 0;
        System.out.println("STACK: Integer Stack of size " + size + " created!");
    }

    /**
     * Adds the passed element to the stack.
     * Time complexity: O(1)
     * @param x int to add to stack
     */
    public void push(int x) {
        // Check if space exists for this item.
        if (sp < (size)) {
            // Add this item to the stack at the index pointed to by the stack pointer.
            storage[sp] = x;
            System.out.println("STACK: Added " + x + " at index " + sp + ".");
            sp++;
        } else {
            System.out.println("STACK: Stack is full! Cannot push item: " + x);
        }

    }

    /**
     * Pops the top item off of the stack and returns it.
     * Time complexity: O(1)
     * If no item can be removed, an -1 will be returned to signify an error.
     */
    public int pop() {
        int popped;

        // Check if an item exists to pop
        if (sp > 0) {
            // Get the next item off of the stack
            popped = storage[sp-1];
            System.out.println("STACK: Popped " + popped + " off of the stack from index " + sp + ".");
            sp--;
        } else {
            popped = -1;
            System.out.println("STACK: Stack is empty! Cannot pop item.");
        }
        return popped;
    }

    /**
     * Returns the number of elements this stack can support.
     * @return max elements as an integer
     */
    public int getMaxSize() {
        return this.size;
    }

    /**
     * Returns the number of elements that are currently stored in this stack.
     * @return elements on stack as an integer
     */
    public int getCount() {
        return this.sp;
    }

}
