/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    if(digits.length ==1 && digits[0] ==0){
        return [1];
    };

    for (let index = digits.length-1; index >=0; index--) {
        if(digits[index] !== 9){
            digits[index]++;

            break;
        }
        digits[index] = 0;
        if(index == 0){
            digits.unshift(1)
        }
        
    }
    return digits;
};
console.log(plusOne([0]));