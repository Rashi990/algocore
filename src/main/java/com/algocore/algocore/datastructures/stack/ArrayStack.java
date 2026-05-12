package com.algocore.algocore.datastructures.stack;

public class ArrayStack implements StackOperations{

    private int[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new int[capacity];
        top = -1;
    }

    //Push an element into the stack
    @Override
    public void push(int data) {
        if (top == stack.length-1){
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        stack[top] = data;
    }

    //Pop an element from the stack
    @Override
    public int pop() {
        if (isEmpty()){
            throw new RuntimeException("Stack Underflow");
        }
        int deleted = stack[top];
        top--;
        return deleted;
    }

    //Get the peek(top without poping) element
    @Override
    public int peek() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    //Check if stack is empty
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    //Get the current no of elements in the stack
    @Override
    public int size() {
        return top+1;
    }

    //Print stack
    @Override
    public int[] printStack() {
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int[] result = new int[top + 1];

        for (int i=0; i<=top; i++){
            result[i] = stack[i];
        }
        return result;
    }
}
