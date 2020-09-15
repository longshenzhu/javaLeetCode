import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n== 1  || n == 2)return n;
        int res = (map.containsKey(n-1)? map.get(n-1) : climbStairs(n-1)) +  (map.containsKey(n-2)? map.get(n-2) : climbStairs(n-2));
        map.put(n, res);
        return res;
    }
    // public int climbStairs(int n) {
    //     if (n <= 2) return n;
    //     int a  = 1, b = 2, result =0;
    //     for (int i = 3; i <= n; i++)
    //     {
    //         result = a + b;
    //         a = b;
    //         b = result;
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     Solution test = new Solution();
    //     int res = test.climbStairs(5);
    //     System.out.println(res);

    // }
}