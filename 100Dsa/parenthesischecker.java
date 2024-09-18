class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : x.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                stack.push(c);
            }else{
                if(c == ')' && (stack.isEmpty() || stack.peek() != '(')){
                    return false;
                }
                
                if(c == ']' && (stack.isEmpty() || stack.peek() != '[')){
                    return false;
                }
                
                if(c == '}' && (stack.isEmpty() || stack.peek() != '{')){
                    return false;
                }
                
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}