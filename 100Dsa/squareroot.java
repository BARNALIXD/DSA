class Solution {
    long floorSqrt(long n) {
    
        int count=0;
        for(int i=1;i<=n/2+1;i++){
            if(i*i>n){
                count=i-1;
                return count;
            }
            
            else if(i*i==n){
                count=i;
                return count;
            }
            
            
            
        }
        
        return count;
        
    }
}
//