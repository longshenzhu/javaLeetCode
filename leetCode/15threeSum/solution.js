/**
 * @param {number[]} nums
 * @return {number[][]}
 */
//
var threeSum = function(nums) {
    var sum=[];
    nums = nums.sort((a,b)=> a-b);
    for(var i=0;i < nums.length-2; i++){
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        for(var j= i+1,k=nums.length-1; j < k;){
            if(j>i+1 && nums[j]== nums[j-1]){
                j++;
                continue;
            }
            if(k<nums.length-1 && nums[k]== nums[k+1]){
                k--;
                continue;
            }
            if(nums[j] + nums[k] > 0-nums[i]){
                k--;
            }else if(nums[j] + nums[k] < 0-nums[i]){
                j++
            }else if(nums[j] + nums[k] == 0-nums[i]){
                sum.push([nums[i],nums[j],nums[k]]);
                j++;
                k--;
            }
        }
    }
    return sum;
};
console.log(threeSum([-1,0,1,2,-1,-4]));