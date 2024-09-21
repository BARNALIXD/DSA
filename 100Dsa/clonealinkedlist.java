class Solution {
    Node copyList(Node head) {
        
        HashMap<Node, Node> map = new HashMap<>();
        
        
        Node temp = head;
        while (temp != null) {
            map.put(temp, new Node(temp.data));
            temp = temp.next;
        }
        
        
        temp = head;
        while (temp != null) {
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        
        
        return map.get(head);
    }
}