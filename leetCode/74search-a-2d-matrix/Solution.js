/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    if(!matrix || matrix.length == 0)return false;
    let row = matrix.length;
    let column = matrix[0].length;

    let low = 0;
    let high = row * column -1;
    if(high == 0)return matrix[0][0] == target;
    
    while(low <= high){
        let mid = (low + high)>>1;
        let num = matrix[Math.floor(mid/column)][mid%column];
        if(target == num)return true;
        if(target < num){
            high = mid -1;
        }else{
            low = mid + 1;
        }
    }
    return false;

};