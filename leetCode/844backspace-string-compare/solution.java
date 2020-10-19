import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        return helper(S).equals(helper(T)) ? true : false;  // 比较toString返回的字符串即可
    }

    public String helper(String S) {
        StringBuilder sb = new StringBuilder();     // 字符串拼接效率更高
        char[] c = S.toCharArray();
        int count = 0;
        for (int i = c.length - 1; i >= 0; i--) {   // 逆序读数组
            if (c[i] == '#') {                      // 遇到退格符时,count++
                count++;
                continue;
            }
            if (count > 0) {                        // 非退格符，但该字符被退格，count--
                count--;
                continue;
            }
            sb.append(c[i]);                        // 非退格符，count为0时添加
        }
        return sb.toString();
    }

    // public boolean backspaceCompare(String S, String T) {
        
    //     List<Character> sList = new ArrayList<>();
    //     List<Character> tList = new ArrayList<>();
    //     for (int i = 0; i < S.length(); i++) {
    //         char charctor1 = S.charAt(i);
    //         if(charctor1 == '#'){
    //             if(!sList.isEmpty()){
    //                 sList.remove(sList.size());
    //             }
    //         }
    //         else {
    //             sList.add(charctor1);
    //         }
    //     }
    //     for (int j = 0; j < T.length(); j++) {
    //         char charctor2 = T.charAt(j);
    //         if(charctor2 == '#'){
    //             if(!tList.isEmpty()){
    //                 tList.remove(tList.size());
    //             }
    //         }
    //         else {
    //             tList.add(charctor2);
    //         }
    //     }
    //     if(sList.size() != tList.size())return false;
    //     for (int i = 0; i < sList.size(); i++) {
    //         if(sList.get(i)!= tList.get(i))return false;
    //     }
    //     return true;
    // }
}