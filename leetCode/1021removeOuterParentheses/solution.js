/**
 * @param {string} S
 * @return {string}
 */
var removeOuterParentheses = function(S) {
    var ans ="",stack = [];
    for(var char of S){
        if(char == '('){
            if(stack.length>0){
                ans+=char;
            }
            stack.push(char);
        }else if(char == ')'){
            stack.pop();
            if(stack.length>0){
                ans+=char;
            }
        }else{
            ans+=char;
        }
    } 
    console.log(ans);
    return ans;
};
// var removeOuterParentheses = function(S) {
//     class Stack{
//         constructor(){
//             this.data = [];
//         }

//         pop(){
//             if(!this.isEmpty()){
//                 return this.data.pop();
//             } 
//         }

//         push(val){
//             this.data.push(val);
//         }

//         isEmpty(){
//             return this.data<=0;
//         }
//     }

//     var ans ="";
//     var stack = new Stack();
//     for(var char of S){
//         if(char == '('){
//             if(!stack.isEmpty()){
//                 ans+=char;
//             }
//             stack.push(char);
//         }else if(char == ')'){
//             stack.pop();
//             if(!stack.isEmpty()){
//                 ans+=char;
//             }
//         }else{
//             ans+=char;
//         }
//     } 
//     return ans;
// };

removeOuterParentheses("(()())(())");