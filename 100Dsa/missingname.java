

// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum = sum+arr[i];
        }
        int sum1 = n*(n+1)/2;
        return sum1-sum;
    }
}