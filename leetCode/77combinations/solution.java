import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        // List<List<Integer>> ans = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        res.set(0, 1);
        recusion(0,res, n, k);
        return ans;
        
    }

    public List<Integer> recusion(int level,List<Integer> res, int n, int k){
        //重复选取每一个元素的值

        //1.terminator
        if(level> k -1){
            return res;
        }
        if(res.get(res.size()-1) < n){
            ans.add(recusion(res.size(), res, n, k));

            List<Integer> newRes = new ArrayList<>();
            for (int i = 0; i < res.size()-1; i++) {
                newRes.set(i, res.get(i));
            }
            int vale = res.get(res.size()-1) + 1;
            while(res.contains(vale) && vale<= n){
                vale ++;
            }
            newRes.set(res.size(), vale);
            ans.add(recusion(level+1, newRes, n, k));
        }else if(res.get(level)== n){
            ans.add(recusion(level+1, res, n, k));
        }
        //3 recusion 
        return recusion(res.size(), res, n, k);

    }
}