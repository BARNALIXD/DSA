class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int sum2 = 0;
        for(int i : arr){sum2+=i;}
        int sum1 = 0;
        for(int i : arr){
            sum1 += i;
            sum2 -= i;
            if(sum1==sum2){return true;}
        }
        return false;
    }
}
//