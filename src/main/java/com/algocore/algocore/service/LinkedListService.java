package com.algocore.algocore.service;

import com.algocore.algocore.datastructures.linkedlist.SinglyLinkedList;
import org.springframework.stereotype.Service;

@Service
public class LinkedListService {

    private final SinglyLinkedList linkedList = new SinglyLinkedList();

    public void insertAtEnd(int data){
        linkedList.insertAtEnd(data);
    }

    public void insertAtBeginning(int data){
        linkedList.insertAtBeginning(data);
    }

    public void delete(int data){
        linkedList.delete(data);
    }

    public boolean search(int data){
        return linkedList.search(data);
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public int[] printList(){
        return linkedList.printList();
    }
}

