package com.tonyandrys.ds;

/**
 * com.tonyandrys.ds - IntegerQueue
 *
 * @author Tony Andrys
 *         Created: 10/18/2013
 */

/**
 * A simple implementation of a queue using an array.
 * Performs FIFO based storage/retrieval of integer values.
 */
public class IntegerQueue {

    private int size; // Maximum capacity of the queue
    private int qp; // Queue pointer holds the index of the next item to dequeue.
    private int[] storage;

    public IntegerQueue(int size) {
        this.size = size;
        qp = -1;
        storage = new int[size];
        System.out.println("QUEUE: Integer Queue of size " + size + " created.");
    }

    /**
     * Adds an item to the queue.
     * Time complexity: O(1)
     * @param x int to enqueue
     */
    public void enqueue(int x) {
        if (qp < size-1) {
            qp++;
            storage[qp] = x;
            System.out.println("QUEUE: Queued up item " + x + ".");
            System.out.println("QUEUE: Queue pointer = " + qp);
        } else {
            System.out.println("QUEUE: Cannot queue item " + x + "! Queue is full.");
        }
    }

    /**
     * Returns the integer at the front of the queue.
     * Time complexity: O(1)
     * @return dequeued integer
     */
    public int dequeue() {
        int dequeued;

        if (qp > -1) {
            dequeued = storage[qp];
            System.out.println("QUEUE: Dequeued item " + dequeued + ".");
            qp--;
            System.out.println("QUEUE: Queue pointer = " + qp);
            return dequeued;
        } else {
            System.out.println("QUEUE: Cannot dequeue! No items have been queued up.");
            dequeued = -1;
        }
        return dequeued;
    }

    /**
     * Returns maximum capacity of the queue.
     * @return capacity as an integer
     */
    public int getMaxSize() {
        return this.size;
    }

    /**
     * Returns number of elements currently queued.
     * @return # of queued elements as an integer
     */
    public int getCount() {
        return qp+1;
    }

}
