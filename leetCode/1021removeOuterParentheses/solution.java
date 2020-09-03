class Solution {
    public String removeOuterParentheses(String S) {
        int flag = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i< S.length();i++){
            char temp = S.charAt(i);
            if(temp == '(' && flag++ > 0){
                ans.append(temp);
            }else if(temp == ')' &&  --flag>0){
                ans.append(temp);
            }
        } 
        return ans.toString();
    }
}

// class Solution {
//     public String removeOuterParentheses(String S) {
//         int flag = 0;
//         StringBuilder ans = new StringBuilder();
//         for(int i=0;i< S.length();i++){
//             char temp = S.charAt(i);
//             if(temp == '('){
//                 if(flag>0){
//                     ans.append(temp);
//                 }
//                 flag++;
//             }else if(temp == ')'){
//                 flag--;
//                 if(flag>0){
//                     ans.append(temp);
//                 }
//             }
//         } 
//         return ans.toString();
//     }
// }

// import java.util.Stack;

// class Solution {
//     public String removeOuterParentheses(String S) {
//         Stack<Character> stack = new Stack<>();
//         StringBuilder ans = new StringBuilder();
//         for(int i=0;i< S.length();i++){
//             char temp = S.charAt(i);
//             if(temp == '('){
//                 if(!stack.empty()){
//                     ans.append(temp);
//                 }
//                 stack.push(temp);
//             }else if(temp == ')'){
//                 stack.pop();
//                 if(!stack.empty()){
//                     ans.append(temp);
//                 }
//             }else{
//                 ans.append(temp);
//             }
//         } 
//         return ans.toString();
//     }
// }