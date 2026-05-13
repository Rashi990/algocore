package com.algocore.algocore.service;

import com.algocore.algocore.datastructures.stack.ArrayStack;
import org.springframework.stereotype.Service;

@Service
public class StackService {

    private ArrayStack arrayStack;

    public void initialize(int capacity){
        arrayStack = new ArrayStack(capacity);
    }

    public void push(int data){
        arrayStack.push(data);
    }

    public int pop(){
        return arrayStack.pop();
    }

    public int peek(){
        return arrayStack.peek();
    }

    public int size(){
        return arrayStack.size();
    }

    public boolean isEmpty(){
        return arrayStack.isEmpty();
    }

    public int[] printStack(){
        return arrayStack.printStack();
    }
}

