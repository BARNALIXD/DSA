class Solution {
    int totalCount(int k, int[] arr) {
        int sum=0;
        for(int num : arr){
            sum+= num/k;
            if(num%k!=0) sum++;
        } 
        
        return sum;
    }
}