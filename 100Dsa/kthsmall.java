class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] store=new int[max+1];
        for(int i=0;i<arr.length;i++){
            store[arr[i]]=1;
        }
        int count=0;
        int i=0;
        while(count!=k){
            if(store[i]==1){
                count++;
            }
            i++;
        }
        return i-1;
    }
}
