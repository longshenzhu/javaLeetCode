import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))return 0;


        //找到了单词，记录路径长度返回
        //依次找变换过一个字母的单词
        //记录访问过的单词，避免重复访问
        
        return 0;
    }

    public void dfs(String beginWord, String endWord, List<String> wordList, Stack<String> path){
        //
        if(beginWord.equals(endWord)){
            path.push(beginWord);
            return;
        }

        //

    }

    public List<String> findCandidates(String beginWord, List<String> wordList){
        List<String> res = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            if(check(beginWord, wordList.get(i))){
                res.add(wordList.get(i));
            }
        }
        return res;
    }

    private boolean check(String first, String second) {
        if(first.length() != second.length())return false;
        int diff = 0;
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) == second.charAt(i)){
                continue;
            }else{
                //两个以上
                if(diff>0) return false;
                diff++;
            }   
        }
        return true;
    }
    

}