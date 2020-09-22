function majorityElement(nums) {
    var cand_num = nums[0], count = 1;
    for (let i = 1; i < nums.length; i++) {
        console.log(cand_num,count,nums[i]);
        if(count == 0){
            cand_num = nums[i];
            count = 1; 
        }else{
            count += cand_num == nums[i]? 1: -1;
        }
    }
    return cand_num;
}

var result = majorityElement([10,9,9,9,10]);
console.log("result",result);