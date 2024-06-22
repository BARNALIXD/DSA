var missingNumbers = function(nums){
    const n = nums.length;
    const tsum = (n*(n+1)) / 2;
    const actualSum = nums.reduce((acc,nums)=> acc+nums , 0);
    return tsum - actualSum;
}