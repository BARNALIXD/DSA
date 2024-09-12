class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null){
            return;
        }else{
            
            mirror(node.left);
            mirror(node.right);
            
            // after traversing both sides left and right swap while backtracking 
            Node temp= node.left;
            node.left =node.right;
            node.right = temp;
            
            
        }
    }
}