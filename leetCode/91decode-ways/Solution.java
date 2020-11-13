class Solution {
    public int numDecodings(String s) {
        if(s.startsWith("0"))return 0;
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < len + 1; i++) {
            Character i_2 = s.charAt(i-2);
            Character i_1 = s.charAt(i-1);
            //1-26之间
            if(i_2 == '1' || (i_2 == '2' && i_1 < '7')){
                if(i_1 == '0') { 
                    dp[i] = dp[i-2];
                }else{
                    dp[i] = dp[i-1] + dp[i-2];
                }
            }else if(i_1 == '0'){
                return 0;
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[len];
    }

    // public int numDecodings(String s) {
    //     int n = s.length();
    //     if(n == 0) return 0;
    //     int[] dp = new int[n + 1];
    //     dp[0] = 1;
    //     dp[1] = s.charAt(0) == '0' ? 0 : 1;
    //     for(int i = 1; i < n; i++){
    //         if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2' && s.charAt(i) <'7'){
    //             if(s.charAt(i) == '0') dp[i + 1] = dp[i - 1];
    //             else dp[i + 1] = dp[i] + dp[i - 1];
    //         }else if(s.charAt(i) == '0'){
    //             return 0;
    //         }else{
    //             dp[i + 1] = dp[i];
    //         }
    //     }
    //     return dp[n];
    // }

    // public int numDecodings(String s) {
    //     if(s.startsWith("0"))return 0;
    //     int len = s.length();
    //     int[] dp = new int[len + 1];
    //     dp[0] = 1;
    //     dp[1] = 1;
    //     for (int i = 2; i < len + 1; i++) {
    //         Character i_2 = s.charAt(i-2);
    //         Character i_1 = s.charAt(i-1);
    //         if(i_2 == '0' && i_1 == '0') return 0;
    //         if(i_2 == '0' && i_1 != '0') {
    //             dp[i] = dp[i-1];
    //         }
    //         if(i_2 != '0' && i_1 == '0') {
    //             if(i_2 == '1' || (i_2 == '2' && i_1 < '7')) {
    //                 dp[i] = dp[i-2];
    //             } else {
    //                 return 0;
    //             }
                
    //         }
    //         if(i_2 != '0' && i_1 != '0'){
    //             dp[i] = dp[i-1] + ((i_2 == '1'||(i_2 == '2' && i_1 < '7'))? dp[i-2] : 0);       
    //         }
    //     }
    //     return dp[len];
    // }
}