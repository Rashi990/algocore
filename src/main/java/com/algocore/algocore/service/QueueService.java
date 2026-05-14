package com.algocore.algocore.service;

import com.algocore.algocore.datastructures.queue.ArrayQueue;
import org.springframework.stereotype.Service;

@Service
public class QueueService {

    private ArrayQueue arrayQueue;

    public void initialize(int capacity){
        arrayQueue = new ArrayQueue(capacity);
    }

    public void enqueue(int data){
        arrayQueue.enqueue(data);
    }

    public int dequeue(){
        return arrayQueue.dequeue();
    }

    public int front(){
        return arrayQueue.front();
    }

    public int size(){
        return arrayQueue.size();
    }

    public boolean isEmpty(){
        return arrayQueue.isEmpty();
    }

    public int[] printQueue(){
        return arrayQueue.printQueue();
    }
}
