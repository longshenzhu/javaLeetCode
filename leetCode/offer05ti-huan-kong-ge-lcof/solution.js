/**
 * @param {string} s
 * @return {string}
 */
var replaceSpace = function(s) {
    let res = [];
    for (const iterator of s) {
        res.push(iterator == ' '?'%20' : iterator);
    }
    return res.join('');
    

    // let res = '';
    // for (const iterator of s) {
    //     res += iterator == ' '?'%20' : iterator;
    // }
    // return res;


    // let iterator = s[Symbol.iterator]();
    // let res = '';
    // let item = iterator.next();
    
    // while(!item.done){
    //     if(!item.done && item.value != ' ')res += item.value;
    // }

};
replaceSpace("We are happy.");