
class Solution {
    
    public int jump(int[] nums) {
        if(nums.length<=1)return 0;
        //找到每一步到达最远的距离,找局部最优
        int count = 0;
        

        int cur = 0;      //当前位置指针
        while(cur< nums.length-1){
            int step = 0;
            int maxSteps = 0;
            for(int i= 1; i<=nums[cur]; i++){
                if(nums[cur+i] + i > maxSteps) {
                    maxSteps = nums[cur+i] + i;
                    step = i;
                }
                
            }
            cur = cur + step;
            count ++;
        }

        return count;
    }
}