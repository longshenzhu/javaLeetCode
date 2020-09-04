/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
var wordPattern = function(pattern, str) {
    var strs = str.split(" ");
    if(pattern.length != strs.length)return false;
    var cache = new Map();
    for(let i=0;i < strs.length; i++){
        if(cache.has(pattern.charAt(i))){
            if(cache.get(pattern.charAt(i)) != strs[i]){
                return false;
            };
            
        }else{
            if(cache.values.indexOF(strs[i] >=0)){
                return false;
            }
            cache.set(pattern.charAt(i), strs[i]);
        }
        
    }
    return true;
    
};
console.log(wordPattern("abba","dog cat cat dog"));