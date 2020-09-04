/**
 * @param {number} num
 * @return {number}
 */

//参考 https://leetcode-cn.com/problems/add-digits/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-5-7/
var addDigits = function(num) {
    // X = 100*a + 10*b + c = 99*a + 9*b + (a+b+c)；所以对9取余即可。
    if(num>9){
        num = num%9;
        if(num == 0)return 9;
    }
    return num;
};

// class Solution {
//     public int addDigits(int num) {
//         return (num - 1) % 9 + 1;
//     }
// }

//递归解法
// var addDigits = function(num) {
//     console.log(num);
//     if(num<10){
//         return num;
//     }
//     let sum = 0;
//     for (let digit of num.toString()) {
//         console.log(digit);
//         sum += parseInt(digit);
//     }
//     return addDigits(sum);
// };

// console.log(addDigits(52));