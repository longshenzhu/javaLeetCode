/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    var length = nums.length;
    for(var i = 0, j =0;i< length;i++){
        if(nums[i] != 0){
            var temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }
};
var testNums = [1,1,0,0,6];
moveZeroes(testNums);
console.log(testNums);