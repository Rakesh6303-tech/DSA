import java.util.*;

// Node class representing a single element in the linked list
class Node {
    int data;   // Stores the data of the node
    Node next;  // Reference to the next node

    // Constructor to initialize the node with given data
    Node(int data) {
        this.data = data;
        this.next = null;  // By default, the next pointer is null
    }
}

// LinkedList class containing methods to manage the list
class LinkedList {
    Node head; // Head node of the linked list (first node)

    // Method to print all elements of the linked list
    void printLinkedList() {
        Node curr = this.head; // Start from the head
        while (curr != null) { // Loop until the end of the list
            System.out.println(curr.data); // Print current node's data
            curr = curr.next; // Move to the next node
        }
    }

    // Method to add an element at the end of the list
    void add(int e) {
        Node temp = new Node(e); // Create a new node
        if (head == null) { // If the list is empty
            head = temp; // New node becomes the head
        } else {
            Node curr = head;
            while (curr.next != null) { // Traverse to the last node
                curr = curr.next;
            }
            curr.next = temp; // Link new node at the end
        }
    }

    // Method to add an element at the start of the list
    void addFirst(int e) {
        Node temp = new Node(e); // Create a new node
        if (head == null) { // If the list is empty
            head = temp;
        } else {
            temp.next = head; // Point new node to current head
            head = temp;      // Make new node the head
        }
    }

    // Method to insert an element at a specific index
    void add(int index, int element) {
        if (index == 0) { // If inserting at the start
            addFirst(element);
        } else {
            Node temp = new Node(element); // New node to insert
            int count = 0;
            Node curr = this.head;
            // Traverse to the node before the desired position
            while (count < index - 1) {
                curr = curr.next;
                count++;
            }
            // Adjust links to insert new node
            temp.next = curr.next;
            curr.next = temp;
        }
    }
}

// Main class to test the linked list
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create a linked list

        // Add elements at the end
        ll.add(10);  // index 0
        ll.add(20);  // index 1
        ll.add(30);  // index 2
        ll.add(40);  // index 3

        // Insert element 24 at index 2
        ll.add(2, 24);

        // Print the list after insertion
        ll.printLinkedList();
    }
}
