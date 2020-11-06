class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)return "";
        if(strs.length == 1)return strs[0];
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if(str.length()< minLen)minLen = str.length();
        }

        
        for (int i = 0; i < minLen; i++) {
            Character ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].charAt(i) != ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLen);
    }
}