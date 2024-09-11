// Java program to show the implementation of singly linked
// list

// A linked list node
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class GfG {

    // Function to print the linked list
    public static void printList(Node head) {
        // Loop that runs till head is null
        while (head != null) {

            // Printing current node data
            System.out.print(" " + head.data);

            // Moving to the next node in the list
            head = head.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        // Printing the above list
        System.out.print("Linked List:");
        printList(head);
    }
}
