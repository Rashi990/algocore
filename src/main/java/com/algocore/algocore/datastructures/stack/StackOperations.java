package com.algocore.algocore.datastructures.stack;

public interface StackOperations {

    void push(int data);
    int pop();

    int peek();

    boolean isEmpty();
    int size();

    int[] printStack();
}
