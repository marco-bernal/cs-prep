package com.mab.cs_prep.ds.queue;

/**
 * Pretty basic implementation of a Queue.
 * FIFO (First In First Out)
 * Operations:
 *
 * insert (Add element). Just changes the rear pointer's position to the last cell in the array.
 * remove (Delete element). Just changes the front pointer's position from the beginning of the array to the next cell
 * which now is the "new" front.
 *
 * rear is the last position.
 * front is the first position.
 **/
public class BareQueue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int items;

    public BareQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0; //first position of the array
        this.rear = -1; //means the queue is empty
        this.items = 0;
    }

    /**
     * Adds elements at the end of the array. Normal array insertion. Updates the rear pointer to track the last item.
     *
     * @param value item to be inserted at the end of the array.
     */
    public void insert(int value) {
        rear++;
        queueArray[rear] = value;
        items++;
    }

    /**
     * Deletes element at the front position, at the beginning of the array.
     *
     * @return deleted value or old_front.
     */
    public long delete() {
        long old_front = queueArray[front];// to return the previous front, before is "removed".
        front++;
        items--;
        return old_front;
    }

    /**
     * Retrieves the peek front value.
     * @return current front value.
     */
    public long peek() {
        return queueArray[front];
    }

    /**
     * Validates if the queue is empty.
     * @return true / false.
     */
    public boolean isEmpty() {
        return (items == 0);
    }

    /**
     * Validates if the queue is full.
     * @return true / false.
     */
    public boolean isFull() {
        return (items ==  maxSize);
    }

    /**
     * Returns the number of elements in the queue.
     * @return total elements.
     */
    public int getNoElements() {
        return items;
    }
}
