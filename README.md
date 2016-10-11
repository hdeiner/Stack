Stack
=====
A small example of Test Driven Development.

Stacks are basic data structures that provide the following functionality:

+ push() 
+ pop()
+ top()
+ isEmpty()

The stack implemented here works on Strings.  When constructed, the maximum size of the stack is passed as an integer.

Code Examples
-------------

Initialize a stack called myStack capable of holding 3 Strings.

```java
Stack myStack = new Stack(10);
```

Pop the empty stack.  This will cause an "stack underflow" exception.

```java
String animal = myStack.pop();
```

See if the stack is empty.

```java
boolean state = myStack.isEmpty();  // returns true
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
boolean stackCheck = myStack.top().equals("Dog");  //returns true 
```

Overflow this 3 String stack.  This will cause an "stack overflow" exception.

```java
myStack.push("Cat");
myStack.push("Goldfish");
myStack.push("Ferret")
```

Internally, internally, out stack is implemented as a String array.