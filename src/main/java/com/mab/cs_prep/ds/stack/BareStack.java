package com.mab.cs_prep.ds.stack;

//TODO: Add stack implementing a node (Already in old package). Double check it, and improve it if needed.
/**
 * Pretty basic implementation of a Stack.
 * LIFO (Last In First Out)
 * Operations:
 * Push (Add element). Just changes the pointer's position to teh next cell in the array.
 * Pop (Delete element). These method actually, doesn't remove anything. Just changes the pointer's position
 * to a previous cell inside the array.
 *
 * Top is the pointer where the current data is stored.
 **/
public class BareStack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public BareStack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    /**
     * Overrides the value in the top index, simulating an insertion.
     * @param value number to be overridden.
     */
    public void push(char value) {
        top++;
        stackArray[top] = value;
    }

    /**
     * Simulates deleting an item from the array.
     * @return Latest inserted value.
     */
    public char pop() {
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    /**
     * Returns current pointer's data.
     * @return value at the current pointer.
     */
    public char peak() {
        return stackArray[top];
    }

    /**
     * Validates if the stack is empty. -1 means it has no elements added yet.
     * @return true / false.
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     * Validates if the stack is full.
     * @return true / false.
     */
    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
