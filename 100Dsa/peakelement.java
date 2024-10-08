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