class Solution {
    public int numDecodings(String s) {
        if(s.startsWith("0"))return 0;
        int len = s.length();
        if(len == 0 || len == 1)return len;
        Integer[] dp = new Integer[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < len + 1; i++) {
            if(s.substring(i-2, i).equals("00"))return 0;
            if(s.substring(i-1, i).equals("0")){
                dp[i] = dp[i-2];
                continue;
            }
            // System.out.println(s.substring(i-2, i));
            int codeNum = Integer.parseInt(s.substring(i-2, i));
            if(codeNum < 10){
                dp[i] = dp[i-1];
            }else{

                dp[i] = dp[i-1] + (codeNum <= 26 ? dp[i-2] : 0);
            }
        }
        return dp[len];       
    }
}