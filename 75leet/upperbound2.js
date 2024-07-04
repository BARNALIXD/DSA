function upperbound (arr,x,n){
    let low = 0 , high = n-1;
    let ans = n;

    while (low <= high) {
        let mid = Math.floor((low+high)/2);
        //maybe an ans
        if (arr[mid]>x) {
            ans= mid;

            high = mid-1;
        }
        else {
            low = mid =1;
        }
    }
    return ans;
}
let arr = [3,5,8,9,15,19];
let n = 6, x = 9 ;
let ind = upperbound(arr,x,n);
console.log("the upperbound is:"+ind);