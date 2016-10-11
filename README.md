Stack
=====
A small example of Test Driven Development.

According to Wikipedia, at https://en.wikipedia.org/wiki/Stack_(abstract_data_type),

In computer science, a stack is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the most recently added element that was not yet removed. The order in which elements come off a stack gives rise to its alternative name, LIFO (for last in, first out). Additionally, a peek operation may give access to the top without modifying the stack.

The name "stack" for this type of structure comes from the analogy to a set of physical items stacked on top of each other, which makes it easy to take an item off the top of the stack, while getting to an item deeper in the stack may require taking off multiple other items first.

![Diagram of a lifo stack](./LifoStack.png)

Our stack will provide the following functionality:

+ isEmpty()
+ push() 
+ pop()
+ peek()

The stack implemented here works on Strings.  When constructed, the maximum size of the stack is passed as an integer.

Code Examples
-------------

Initialize a stack called myStack capable of holding 3 Strings.

```java
Stack myStack = new Stack(3);
```

See if the stack is empty.

```java
boolean state = myStack.isEmpty();  // returns true
```

Pop the empty stack.  This will cause an "stack underflow" exception.

```java
String animal = myStack.pop();
```

Push "Dog" onto the stack

```java
myStack.push("Dog")
```

See if the stack is empty.

```java
boolean state = myStack.isEmpty();  // returns false
```

Check the top entity on the stack for "Dog".

```java
boolean stackCheck = myStack.peek().equals("Dog");  //returns true 
```

Overflow this 3 String stack.  This will cause an "stack overflow" exception.

```java
myStack.push("Cat");
myStack.push("Goldfish");
myStack.push("Ferret")
```

Internally, internally, our stack is implemented as a String array.