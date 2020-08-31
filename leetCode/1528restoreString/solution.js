/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    var result = [];
    for(var i = 0; i < indices.length; i++){
        result[indices[i]] = s.charAt(i);
    }

    return result.join("");
};
console.log(restoreString("codeleet", [4,5,6,7,0,2,1,3]));