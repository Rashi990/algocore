package com.algocore.algocore.datastructures.linkedlist;

public class SinglyLinkedList implements LinkedListOperations{

    private Node head;

    @Override
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }
        Node current = head; //traversal

        while (current.next != null){
            current = current.next;
        }
        current.next = newNode; //insert
    }

    @Override
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void delete(int data) {
        if (head == null){
            throw new RuntimeException("List is empty");
        }
        if (head.data == data){
            head = head.next;
            return;
        }
        Node current = head;

        while (current.next != null && current.next.data != data){
            current = current.next;
        }
        if (current.next == null){
            throw new RuntimeException("Data not found");
        }
        current.next = current.next.next;
    }

    @Override
    public boolean search(int data) {
        Node current = head;
         while (current != null){
             if (current.data == data){
                 return true;
             }
             current = current.next;
         }
         return false;
    }

    @Override
    public int size() {
        int count = 0;
        Node current = head;

        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int[] printList() {
        if (head == null){
            throw new RuntimeException("List is empty");
        }
        int[] result = new int[size()];
        Node current = head;
        int index = 0;

        while (current != null){
            result[index++] = current.data;
            current = current.next;
        }
        return result;
    }
}
