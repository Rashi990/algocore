package com.algocore.algocore.datastructures.queue;

public class ArrayQueue implements QueueOperations{

    private int[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    //Enqueue (insert) element - FIFO
    @Override
    public void enqueue(int data) {
        if (rear == queue.length-1){
            throw new RuntimeException("Queue Overflow");
        } else if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = data;
    }

    //Dequeue (remove) element
    @Override
    public int dequeue() {
        if (front == -1){
            throw new RuntimeException("Queue Underflow");
        }
        int removed = queue[front];

        if (front == rear){ //check if only one element in the queue
            front = rear = -1; //queue becomes empty
        }
        else {
            front++;
        }
        return removed;
    }

    //Get front element
    @Override
    public int front() {
        if (front == -1){
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    //Get the current size of the queue
    @Override
    public int size() {
        if (front == -1){
            return 0;
        }
        return rear - front +1;
    }

    //Print all the elements in the queue
    @Override
    public int[] printQueue() {
        if (front == -1){
            throw new RuntimeException("Queue is empty");
        }

        int[] result = new int[size()];
        int index = 0;

        for (int i = front; i <= rear; i++){
            result[index++] = queue[i];
        }
        return result;
    }
}
