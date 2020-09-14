import java.awt.List;

//参考： https://leetcode-cn.com/problems/get-kth-magic-number-lcci/solution/di-k-ge-shu-jiu-shi-xiang-bu-tong-wei-he-san-zhi-z/
class Solution {
    public int getKthMagicNumber(int k) {
        int[] ans= new int[k+1];
        int p3=0,p5=0,p7=0;
        ans[0]=1;
        for(int i=1;i<k;i++){
            ans[i]=Math.min(Math.min(ans[p3]*3,ans[p5]*5),ans[p7]*7);
            if(ans[i]==ans[p3]*3) p3++;
            if(ans[i]==ans[p5]*5) p5++;
            if(ans[i]==ans[p7]*7) p7++;
        }
        return ans[k-1];
    }
}