package com.capitalone.stack;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StackTest {

    @Test
    public void allocatedStackShouldBeEmpty() {
        Stack myStack = new Stack(10);
        assertThat(myStack.isEmpty(), is(true));
    }

    @Rule
    public ExpectedException stackException = ExpectedException.none();

    @Test
    public void newStackPopThrowsException() throws Exception {
        stackException.expect(Exception.class);
        stackException.expectMessage("stack underflow");
        new Stack(1).pop();
    }

    @Test
    public void pushDogStackShouldNotBeEmpty() throws Exception {
        Stack myStack = new Stack(10);
        myStack.push("Dog");
        assertThat(myStack.isEmpty(), is(false));
    }

    @Test
    public void pushDogShouldPopDog() throws Exception {
        Stack myStack = new Stack(10);
        myStack.push("Dog");
        assertThat(myStack.pop(), is("Dog"));
    }

    @Test
    public void pushDogCatShouldPopCat() throws Exception {
        Stack myStack = new Stack(10);
        myStack.push("Dog");
        myStack.push("Cat");
        assertThat(myStack.pop(), is("Cat"));
    }

    @Test
    public void pushDogCatMouseShouldPopPopCat() throws Exception {
        Stack myStack = new Stack(3);
        myStack.push("Dog");
        myStack.push("Cat");
        myStack.push("Mouse");
        myStack.pop();
        assertThat(myStack.pop(), is("Cat"));
    }

}
