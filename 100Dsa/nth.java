

class Solution {
    public long nthStair(int n) {
        // Code here
        int count=1;
        while(n>1){
            n-=2;
            count++;
        }
        return count;
    }
}
//