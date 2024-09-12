class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        if(head == null){
            return head;
        }
        
        Node temp = head;
        Node temp2 = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        if(temp.next == null){
              temp.next = head;
        }
      
        while(k > 1){
            temp2 = temp2.next;
            k--;
        }
        
        head = temp2.next;
        temp2.next = null;
        
        return head;
        
    }
}
//