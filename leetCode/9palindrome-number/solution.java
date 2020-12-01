class Solution {
    //是不是回文数
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x != 0)) {
            return false;
        }
        int spare = x;
        int revert = 0;
        while(spare > revert){
            revert = revert * 10 + spare % 10;
            spare = spare / 10;
        }
        return spare == revert || spare == revert/10;
    }
    // public boolean isPalindrome(int x) {
    //     if(x<0)return false;
    //     if(x<10)return true;
    //     String xStr = String.valueOf(x);
    //     int i=0, len= xStr.length();
    //     while(i< len -i -1){
    //         if(xStr.charAt(i) != xStr.charAt(len - i - 1)){
    //             return false;
    //         }
    //         i++;
    //     }
    //     return true;
    // }
}