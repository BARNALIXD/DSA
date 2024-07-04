function upperbound(arr,x,n) {
    for(let i =0;i <n ; i++){
        if (arr[1]>x){
            return i;
        }
    }
    return n;
}
let arr = [3,5,8,15,19];
let n=6 , x=9;
let ind = upperbound(arr,x,n);
console.log("the upperbound is :",ind);