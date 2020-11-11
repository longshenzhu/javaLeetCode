class Solution {
    int lengthOfLastWord(String s){
        if(s == null || s.length()==0) {
            return 0;
        }
        int len = s.length(), lastWordLen = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') lastWordLen++;
            if (s.charAt(i) == ' ' && lastWordLen > 0) break;
        }
        return lastWordLen;
    }
    // public int lengthOfLastWord(String s) {
    //     if(s == null || s.length()==0) {
    //         return 0;
    //     }
    //     String newStr = s.trim();
    //     int len = newStr.length();
    //     for (int i = len-1; i >=0; i--) {
    //         Character item = newStr.charAt(i);
    //         if(Character.isWhitespace(item)){
    //             return len - i - 1;
    //         }
    //     }
    //     return len;
    // }
    // public int lengthOfLastWord(String s) {
    //     if(s == null || s.length()==0) {
    //         return 0;
    //     }
    //     int len = 0;
    //     boolean lastFlag = false;
    //     for (int i = s.length()-1; i >=0; i--) {
    //         Character item = s.charAt(i);
    //         if(Character.isWhitespace(item)){
    //             if(!lastFlag){
    //                 continue;
    //             }
    //             return len;
    //         }else{
    //             lastFlag = true;
    //             len++;
    //         }
    //     }
    //     return len;
    // }
}