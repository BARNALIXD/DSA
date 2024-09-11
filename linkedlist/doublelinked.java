// Doubly linked list node in Java
class Node {

    // Data field
    int data;

    // Previous node
    Node prev;

    // Next node
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        this.data = new_data;
        this.prev = null;
        this.next = null;
    }
}
