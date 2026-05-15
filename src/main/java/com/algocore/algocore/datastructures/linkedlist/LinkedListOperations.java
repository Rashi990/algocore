package com.algocore.algocore.datastructures.linkedlist;

public interface LinkedListOperations {

    void insertAtEnd(int data);
    void insertAtBeginning(int data);

    void delete(int data);
    boolean search(int data);
    int size();
    boolean isEmpty();
    int[] printList();
}
