package com.algocore.algocore.service;

import com.algocore.algocore.datastructures.array.ArrayImpl;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {

    private ArrayImpl array;

    public void initialize(int capacity){
        array = new ArrayImpl(capacity);
    }

    public void insert(int data){
        array.insert(data);
    }

    public int search(int data){
        return array.search(data);
    }

    public int get(int index){
        return array.get(index);
    }

    public int size(){
        return array.size();
    }

    public void delete(int index){
        array.delete(index);
    }

    public int[] printArr(){
        return array.printArr();
    }

}
