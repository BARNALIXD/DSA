


function rowWithMax1s(matrix, n, m) {
    let cnt_max = 0;
    let index = -1;

    // traverse the matrix:
    for (let i = 0; i < n; i++) {
        let cnt_ones = 0;
        for (let j = 0; j < m; j++) {
            cnt_ones += matrix[i][j];
        }
        if (cnt_ones > cnt_max) {
            cnt_max = cnt_ones;
            index = i;
        }
    }
    return index;
}

const matrix = [[1, 1, 1], [0, 0, 1], [0, 0, 0]];
const n = 3, m = 3;
console.log("The row with maximum no. of 1's is: " + rowWithMax1s(matrix, n, m));

