package com.capitalone.stack;

public class Stack {
    String[] stack;
    int stackIndex;

    public Stack(int stackSize) {
        stack = new String[stackSize];
        stackIndex = 0;
    }

    public boolean isEmpty() {
        return (stackIndex == 0);
    }

    public void push(String newElement) throws Exception {
        stack[stackIndex++] = newElement;
    }

    public String pop() throws Exception {
        if (isEmpty()) throw new Exception("stack underflow");
        return stack[--stackIndex];
    }
}
