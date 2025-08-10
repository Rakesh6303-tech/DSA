A Single Linked List is a linear data structure in which elements (called nodes) are connected using pointers.
Each node contains:

Data → the value stored.

Next → a reference (address) to the next node in the sequence.
The last node points to null, indicating the end of the list.
The list is accessed starting from a pointer called head (points to the first node).

  
import java.util.*;
// Class representing a single node in the linked list
class Node {
    int data;     // Data stored in the node
    Node next;    // Reference to the next node

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;   // Assign data to the node
        this.next = null;   // Initially, no next node (null)
    }
}

// Class representing the linked list
class LinkedList {
    Node head;  // Head (first node) of the linked list

    // Method to print all elements of the linked list
    void printLinkedList() {
        Node curr = this.head;  // Start from head
        while (curr != null) {  // Traverse until no more nodes
            System.out.println(curr.data); // Print data of current node
            curr = curr.next;   // Move to the next node
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an empty LinkedList
        LinkedList ll = new LinkedList();

        // Create nodes with data
        Node p1 = new Node(10);
        Node p2 = new Node(20);
        Node p3 = new Node(30);
        Node p4 = new Node(40);

        // Connect nodes to form the chain: p1 → p2 → p3 → p4
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;

        // Set head of linked list to p1
        ll.head = p1;

        // Print all elements of the linked list
        ll.printLinkedList();
    }
}
