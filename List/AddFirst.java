import java.util.*;

// Class representing a single node in the linked list
class Node {
    int data;   // Stores the data
    Node next;  // Stores the reference (address) of the next node

    // Constructor to create a node with given data
    Node(int data) {
        this.data = data;   // Assign the data
        this.next = null;   // Initially, no next node (null)
    }
}

// Class representing the Linked List
class LinkedList {
    Node head;  // Head (first node) of the linked list

    // Method to print all nodes in the linked list
    void printLinkedList() {
        Node curr = this.head;        // Start from head
        while (curr != null) {        // Traverse until end of list
            System.out.println(curr.data); // Print current node's data
            curr = curr.next;         // Move to the next node
        }
    }

    // Method to add an element at the end of the linked list
    void add(int e) {
        Node temp = new Node(e);      // Create a new node
        if (head == null) {           // If list is empty
            head = temp;              // New node becomes head
        } else {                      // If list already has elements
            Node curr = head;         // Start from head
            while (curr.next != null) { // Traverse to the last node
                curr = curr.next;
            }
            curr.next = temp;         // Link last node to new node
        }
    }

    // Method to add an element at the beginning of the linked list
    void addFirst(int e) {
        Node temp = new Node(e);      // Create a new node
        if (head == null) {           // If list is empty
            head = temp;              // New node becomes head
        } else {                      // If list already has elements
            temp.next = head;         // Link new node to the current head
            head = temp;              // Update head to new node
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create linked list

        // Add elements at the end
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        // Add element at the beginning
        ll.addFirst(90);

        // Print the linked list
        ll.printLinkedList();
    }
}
