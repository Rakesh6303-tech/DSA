import java.util.*;

// Node class represents a single element in the linked list
class Node {
    int data;   // Stores the data
    Node next;  // Stores the reference/address of the next node

    // Constructor to create a new node with given data
    Node(int data) {
        this.data = data;   // Assign data to the node
        this.next = null;   // Initially, next is null (no next node yet)
    }
}

// LinkedList class to manage the linked list operations
class LinkedList {
    Node head;  // Head node (first node of the list)

    // Method to print all nodes of the linked list
    void printLinkedList() {
        Node curr = this.head;  // Start from head
        while (curr != null) {  // Traverse until end of list
            System.out.println(curr.data);  // Print current node's data
            curr = curr.next;               // Move to next node
        }
    }

    // Method to add a new element at the end of the linked list
    void add(int e) {
        // Create a new node with given element
        Node temp = new Node(e);

        // If list is empty, new node becomes the head
        if (head == null) {
            head = temp;
        }
        // If list already has nodes, find the last node and attach the new node
        else {
            Node curr = head;              // Start from head
            while (curr.next != null) {    // Traverse till the last node
                curr = curr.next;
            }
            curr.next = temp;              // Link the last node to the new node
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create LinkedList object
        LinkedList ll = new LinkedList();

        // Add elements to linked list
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // Print the linked list
        ll.printLinkedList();
    }
}
