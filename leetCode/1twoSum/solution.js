/**
 * @param {number[]} digits
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = {};
    for(let i=0;i< nums.length;i++){
        if(map.hasOwnProperty(target -nums[i])){
            return [map[target -nums[i]],i];
        }
        map[nums[i]] = i;
    }
    return [];
};
// var twoSum = function(nums, target) {
//     const map = new Map();
//     for(let i=0;i< nums.length;i++){
//         if(map.has(target -nums[i])){
//             return [map.get(target - nums[i]),i];
//         }
//         map.set(nums[i],i);
//     }
//     return [];

// };
console.log(twoSum([2,7,11,15],9));


    // for(var i=0;i<nums.length;i++){
    //     var index = nums.indexOf(target-nums[i])
    //     if(i == index){
    //         continue;
    //     }
    //     if(index!= -1 ){
    //         return [i,index];
    //     }
    // }
    // return [];