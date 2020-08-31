/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    if(height.length<2){
        return 0;
    }
    var i = 0,j= height.length-1,res=0;
    while(i<j){
        if(height[i]<height[j]){
            res = Math.max(res, height[i]*(j-i));
            i++;
        }else{
            res = Math.max(res, height[j]*(j-i));
            j--;
        }
    }
    return res;
};
console.log(maxArea([2,7,11,15]));