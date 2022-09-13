package com.bridgelabz;

public class StackQueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the stack and Queue");

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(23);
        queue.enqueue(56);
        queue.enqueue(90);
        queue.enqueue(11);
        System.out.println(queue.displayQueue());
    }
}
