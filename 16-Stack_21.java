
package mypackage;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}
```

This program defines a `Stack` class in the `mypackage` package that implements stack operations. The `Stack` class has a constructor that initializes the stack with a given size, and methods to push, pop, and peek elements from the stack. It also has methods to check whether the stack is empty or full.

I hope this helps!.

Source: Conversation with Bing, 16/11/2023
(1) Java Program to Implement stack data structure. https://www.programiz.com/java-programming/examples/stack-implementation.
(2) Java Stack Class - Programiz. https://www.programiz.com/java-programming/stack.
(3) Java Stack - Javatpoint. https://www.javatpoint.com/java-stack.
(4) Stack Implementation in Java - Studytonight. https://www.studytonight.com/post/stack-implementation-in-java.
(5) Stack Class in Java - GeeksforGeeks. https://www.geeksforgeeks.org/stack-class-in-java/.
(6) github.com. https://github.com/dhineshbabu/Java_Code_Snippets/tree/4414a6aca1ea308f93b48819c3c6bc730c261985/JavaNewFeatures%2Fsrc%2Fgeneral_programming%2FStackCustom.java.
(7) github.com. https://github.com/cs-bhavik/data-structures/tree/9b02d4d052a81f3f5715303be374d9eb2973f438/Stack%2FStack.java.
(8) github.com. https://github.com/tolga-karabudak/Data-Structures-Problems-and-solutions/tree/e44c7afbbd262429042cbc66a2dbe7c309c3d913/DataLab4%2Fsrc%2Fdatalab4%2FStack.java.
(9) en.wikipedia.org. https://en.wikipedia.org/wiki/Stack_(abstract_data_type).
