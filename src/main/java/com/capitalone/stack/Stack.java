package com.capitalone.stack;

public class Stack {

    private final String[] stack;
    private int stackIndex;
    private final int INITIAL_STACK_INDEX = -1;

    public Stack(int stackSize) {
        stack = new String[stackSize];
        stackIndex = -1;
    }

    public boolean isEmpty() {
        return (stackIndex == INITIAL_STACK_INDEX);
    }

    public void push(String newElement)  {
        stack[++stackIndex] = newElement;
    }

    public String pop() throws Exception {
        if (isEmpty()) throw new Exception("stack underflow");
        return stack[stackIndex--];
    }
}
