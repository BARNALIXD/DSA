

// User function Template for Java

class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int min=-1;
        int c=0;
        for(int i=0;i<height.length;i++){
            if(min<height[i]){
                min=height[i];
                c+=1;
            }
        }
        return c;
    }
}