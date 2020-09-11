/**
 * @param {number} n
 * @return {string[]}
 */

 //参考： https://leetcode-cn.com/problems/generate-parentheses/solution/hui-su-suan-fa-by-liweiwei1419/
var generateParenthesis = function(n) {
    let ans = [];
    recursion("",ans, n, 0, 0);
    console.log(ans);
    return ans;
};
generateParenthesis(3);


function recursion(str, ans, n , left, right){
    //1.terminator
    if(str.length == 2 *n) {
        ans.push(str);
        return;
    }
    
    if(left < n){
        recursion(str+'(', ans, n , left+1, right)
        // str += '(';
        // recursion(str, ans, n , left+1, right);
        // str =str.substring(0,str.length-1);
    }
    if(right< left){
        recursion(str+')', ans, n , left, right+1);
        // str += ')';
        // recursion(str, ans, n , left, right+1);
        // str =str.substring(0,str.length-1);
    }    
}