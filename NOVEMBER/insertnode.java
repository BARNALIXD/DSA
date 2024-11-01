class Node {
    public int data;
    public Node next;

    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    public Node(int data1){
        data = data1;
        next = null;
    }
}

public class Main {

    public static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp
    }
}