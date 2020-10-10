//c++ 学习参考：https://leetcode-cn.com/problems/reverse-string/solution/344-fan-zhuan-zi-fu-chuan-shuang-zhi-zhen-fa-xia-2/
class Solution {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length -1 -i] = temp;
        }

        // //双指针
        // char temp;
        // for (int i = 0, j = s.length - 1; i < s.length/2; i++, j--) {
        //     temp = s[i];
        //     s[i] = s[j];
        //     s[j] = temp;
        // }

}