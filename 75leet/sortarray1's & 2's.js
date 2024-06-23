function searchMatrix(matrix, target) {
    const n = matrix.length;
    const m = matrix[0].length;

    // traverse the matrix:
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            if (matrix[i][j] === target)
                return true;
        }
    }
    return false;
}

const matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]];
searchMatrix(matrix, 8) === true ? console.log("true") : console.log("false");

