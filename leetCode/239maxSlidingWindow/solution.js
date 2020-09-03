/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSlidingWindow = function(nums, k) {
    class SlidingWindow{
        constructor(){
            this.data = [];
        }
    
        //尾部进入队列
        push(val){
            let data = this.data;
            while(data.length>0 && data[data.length - 1] < val){
                data.pop();
            }
            data.push(val);
    
        }
        //头部出队列
        pop(val){
            let data = this.data;
            if(data.length > 0 && data[0] === val){
                data.shift()
            }
        }
    
        max(){
            return this.data[0];
        }
    }
    var ans = [];
    var window = new SlidingWindow();
    for(var i=0;i<nums.length;i++){
        if(i<k-1){
            window.push(nums[i]);
        }else{
            window.push(nums[i]);
            ans.push(window.max());
            window.pop(nums[i-k+1]);
        }
    }
    return ans;
};


/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
// var maxSlidingWindow = function(nums, k) {
//     let n = nums.length;
//     class slideWindow{
//         constructor(){
//             this.data = [];
//         }
//         push(val){
//             let data = this.data;
//             while(data.length > 0 && data[data.length - 1] < val){
//                 data.pop();
//             }
//             data.push(val);
//         }
//         pop(val){
//             let data = this.data;
//             if(data.length > 0 && data[0] === val){
//                 data.shift();
//             }
//         }
//         max(){
//             return this.data[0];
//         }
//     }
//     let res = [];
//     let windows = new slideWindow();
//     for(let i = 0;i < n;i++){
//         if(i < k - 1){
//             windows.push(nums[i]);
//         }else{
//             windows.push(nums[i]);
//             res.push(windows.max());
//             windows.pop(nums[i - k + 1]);
//         }
//     }
//     return res;
// };
