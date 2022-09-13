package com.bridgelabz;

public class StackQueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the stack and Queue");
        Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(90);
        stack.push(45);
        stack.push(50);
        Integer value = stack.pop();
        System.out.println(value);
        System.out.println("Size of stack is : "+stack.size);
        stack.popStack();
        Stack<String> stringStack = new Stack<>();
        System.out.println("Stack is empty "+stack.isEmpty());
        System.out.println("Stack is empty "+stringStack.isEmpty());

    }
}
