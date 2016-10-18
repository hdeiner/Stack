package com.capitalone.stack.test;

import com.capitalone.stack.Stack;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StackTest {

    private Stack theStack;

    @Before
    public void initialize(){
        theStack = new Stack(3);
    }

    @Test
    public void allocatedStackShouldBeEmpty() {
        assertThat(theStack.isEmpty(), is(true));
    }

    @Test
    public void pushDogStackShouldNotBeEmpty() {
        theStack.push("Dog");
        assertThat(theStack.isEmpty(), is(false));
    }

    @Rule
    public final ExpectedException stackException = ExpectedException.none();

    @Test
    public void newStackPopThrowsStackUnderflow() throws Exception {
        stackException.expect(Exception.class);
        stackException.expectMessage("stack underflow");
        new Stack(1).pop();
    }

    @Test
    public void pushDogShouldPopDog() throws Exception {
        theStack.push("Dog");
        assertThat(theStack.pop(), is("Dog"));
    }

    @Test
    public void pushDogCatShouldPopCat() throws Exception {
        theStack.push("Dog");
        theStack.push("Cat");
        assertThat(theStack.pop(), is("Cat"));
    }

    @Test
    public void pushDogCatMousePopShouldBeMousePopShouldBeCat() throws Exception {
        theStack.push("Dog");
        theStack.push("Cat");
        theStack.push("Mouse");
        assertThat(theStack.pop(), is("Mouse"));
        assertThat(theStack.pop(), is("Cat"));
    }

    @Test
    public void pushDogPopPopShouldThrowStackUnderflow() throws Exception {
        stackException.expect(Exception.class);
        stackException.expectMessage("stack underflow");
        theStack.push("Dog");
        theStack.pop();
        theStack.pop();
    }

    //TODO push() should throw Stack Overflow when appropriate
    //TODO peek() should return top element on stack without popping it
    //TODO peek() should throw Stack Underflow when appropriate

}
