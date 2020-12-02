class Solution {
    public int integerBreak(int n) {
        if(n<2)return 0;
        if(n<4) return n - 1;
        else return integerBreakBig(n);
    }

    private int integerBreakBig(int n){
        if(n<=4) return n;
        else return 3 * integerBreakBig(n-3);
    }
}