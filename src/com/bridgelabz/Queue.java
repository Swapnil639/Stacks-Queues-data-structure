package com.bridgelabz;

public class Queue <E> {
    Node<E> rear;
    Node<E> front;
    Node<E> newNode;

    public void enqueue(E value) {
        newNode = new Node(value);
        if (rear == null && front == null) {
            rear = newNode;
        } else {
            front.next = newNode;
        }
        front = newNode;
    }
    public boolean displayQueue(){
        Node currentNode = rear;
        while (currentNode!= null){
            System.out.println(currentNode.key + " ");
            currentNode = currentNode.next;
        }
        return false;
    }

}
