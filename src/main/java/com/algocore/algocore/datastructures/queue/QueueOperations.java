package com.algocore.algocore.datastructures.queue;

public interface QueueOperations {

    void enqueue(int data);
    int dequeue();
    int front();
    boolean isEmpty();
    int size();
    int[] printQueue();
}
