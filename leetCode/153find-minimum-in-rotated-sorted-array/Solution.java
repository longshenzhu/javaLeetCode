class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)return nums[0];
        int left = 0, right = nums.length -1;

        //非旋转的情况
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while(left< right){
            int mid = (left + right)/2; // (left + right)>>1
            if(nums[mid] > nums[nums.length -1]){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        return nums[left];
    }
}