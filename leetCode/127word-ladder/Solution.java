import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int minPath = Integer.MAX_VALUE;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))return 0;

        // List<String> path = new ArrayList<>();
        HashSet<String> path = new HashSet<>();
        path.add(beginWord);
        dfs(beginWord, endWord, wordList, path);
        System.out.println(path);
        return minPath < Integer.MAX_VALUE? minPath : 0;
    }

    // 找到了单词，记录路径长度返回
    // 依次找变换过一个字母的单词
    // 记录访问过的单词，避免重复访问
    public void dfs(String beginWord, String endWord, List<String> wordList,HashSet<String> path){
        //terminator
        if(beginWord.equals(endWord)){
            // path.add(beginWord);
            if(path.size()< minPath)minPath = path.size();
            return;
        }

        for (int i = 0; i < wordList.size(); i++) {
            if(path.contains(wordList.get(i)) || !check(beginWord, wordList.get(i)))continue;
            
            path.add(wordList.get(i));
            dfs(wordList.get(i), endWord, wordList, path);
            path.remove(wordList.get(i));
        }

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