class Solution {
    public boolean checkDuplicatewithinK(int[] arr, int k) {
        int s = k;
        for(int i =0;i < arr.length; i++) {
            for(int j = i+ 1; j <= i + k && j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}