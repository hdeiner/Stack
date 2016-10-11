package com.capitalone.stack;

@SuppressWarnings("WeakerAccess")
public class Stack {

    private final String[] stack;
    private int stackIndex;

    public Stack(int stackSize) {
        stack = new String[stackSize];
        stackIndex = 0;
    }

    public boolean isEmpty() {
        return (stackIndex == 0);
    }

    public void push(String newElement)  {
        stack[stackIndex++] = newElement;
    }

    public String pop() throws Exception {
        if (isEmpty()) throw new Exception("stack underflow");
        return stack[--stackIndex];
    }
}
