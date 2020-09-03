/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    var ans = [];
    for(var i = 1;i<=n;i++){
        switch((i%3 == 0? 1 : 0) + (i%5 == 0? 2 : 0)){
            case 3: 
                ans.push("FizzBuzz");
                break;
            case 2: 
                ans.push("Buzz");
                break;
            case 1: 
                ans.push("Fizz");
                break;
            default:
                ans.push(''+ i);
        }
    }
    return ans;
};

console.log(fizzBuzz(15));