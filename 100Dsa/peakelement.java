class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       int low = 0;
       int high = arr.length - 1 ;
       
       while(low <= high) {
           int mid = (high+low) / 2;
           
           if((mid == 0 || arr[mid] >= arr[mid-1])
           && (mid == arr.length - 1 || arr[mid] >= arr[mid +1])) {
               return mid;
           }else if(mid> 0 && arr[mid - 1] >= arr[mid]){
               high = mid -1 ;
           }else{
               low = mid +1 ;
           }
       }
       return -1;
    }
}
//




//2nd bruteforce

import java.util.*;

public class tUf {
    static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= x) {
                ans = arr[mid];
                //look for smaller index on the left
                low = mid + 1;
            } else {
                high = mid - 1; // look on the right
            }
        }
        return ans;
    }

    static int findCeil(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = arr[mid];
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int f = findFloor(arr, n, x);
        int c = findCeil(arr, n, x);
        return new int[] {f, c};
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0]
                           + " " + ans[1]);
    }
} 