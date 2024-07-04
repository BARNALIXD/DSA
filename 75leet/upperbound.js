
function upperBound(arr, x, n) {
    for (let i = 0; i < n; i++) {
        if (arr[i] > x) {
            // upper bound found:
            return i;
        }
    }
    return n;
}

let arr = [3, 5, 8, 9, 15, 19];
let n = 6, x = 9;
let ind = upperBound(arr, x, n);
console.log("The upper bound is the index:", ind);

