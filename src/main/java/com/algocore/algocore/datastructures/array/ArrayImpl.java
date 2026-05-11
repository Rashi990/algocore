package com.algocore.algocore.datastructures.array;

public class ArrayImpl implements ArrayOperations{

    private int[] arr;
    private int size;

    //Constructor
    public ArrayImpl(int capacity){
        arr = new int[capacity];
        size = 0;
    }

    //Insert element
    @Override
    public void insert(int data) {
      if (size == arr.length){
          throw new RuntimeException("Array is full !");
      }
      arr[size] = data;
      size++;
    }

    //Delete element
    @Override
    public void delete(int index) {
        if (index < 0 || index >= size){
            throw new RuntimeException("Invalid index");
        }
        for (int i =index; i < size - 1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    //Search values
    @Override
    public int search(int data) {
        for (int i = 0; i < size; i++){
            if (arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    //Get elements by index
    @Override
    public int get(int index) {
        if (index < 0 || index >= size){
            throw new RuntimeException("Invalid index");
        }
        return arr[index];
    }

    //No current of stored elements in the array
    @Override
    public int size() {
        return size;
    }

    //Print all the elements of array
    @Override
    public int[] printArr() {
        if (size <= 0 ){
            throw new RuntimeException("No elements in array");
        }
        int[] result = new int[size];
        for (int i=0; i<size; i++){
            result[i] = arr[i];

        }
        return result;
    }
}
