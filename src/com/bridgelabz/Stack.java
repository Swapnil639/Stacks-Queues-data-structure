package com.bridgelabz;

public class Stack<E> {
    Node<E> top;
    Node<E> bottom;
    Node<E> newNode;
    int size = 0;

    public void push(E value) {
        newNode = new Node<>(value);
        if (bottom == null && top == null) {
            top = newNode;
        } else {
            newNode.next = bottom;
        }
        bottom = newNode;
    }

    public void displayStack() {
        Node current = bottom;
        while (current != null) {
            System.out.print(current.key + "->");
            current = current.next;
        }
    }
}
