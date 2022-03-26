package com.java.bridgelabs;

public class LinkedList {
    Node head;
// create class
    class Node {
        // variables
        String data;
        Node next;
        // Create Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // create Method & Add Element First in addFirst Method
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // create Method & print the list use printList Method
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println(" Display The Result of Add");
        linkedList.addFirst("is");
        linkedList.addFirst("This");
        linkedList.printList();
        System.out.println("===============================================");
    }
}
