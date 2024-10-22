class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        
        int len = count(head);
        
        int i = 0 ;
        
        while(i < len - n)
        {
            head = head.next;
            i++ ;
        }
        
        long sum = 0 ;
        
        while(head != null)
        {
            sum += head.data ;
            head = head.next ;
        }
        
        return (int)sum ;
    }
    
    private int count(Node head)
    {
        int ans = 0 ;
        
        while(head != null)
        {
            ans++ ;
            head = head.next ;
        }
        
        return ans ;
    }
}