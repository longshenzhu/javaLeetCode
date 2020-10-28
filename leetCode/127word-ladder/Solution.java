import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.print.DocFlavor.STRING;

import javafx.util.Pair;
class Solution {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))return 0;
        int len = beginWord.length();
        //按照相同规则进行替换的词
        HashMap<String, ArrayList<String>> tongpeiStr = new HashMap<>();
        for (String word : wordList) {
            for (int i = 0; i < len; i++) {
                String pipeiStr = word.substring(0, i) + "*" + word.substring(i+1, len);
                ArrayList<String> pipeiList = tongpeiStr.getOrDefault(pipeiStr, new ArrayList<>());
                pipeiList.add(word);
                tongpeiStr.put(pipeiStr, pipeiList);
            }
        }

        HashMap<String,Boolean> visited = new HashMap<>();
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));
        visited.put(beginWord, true);
        while(!queue.isEmpty()){
            Pair<String, Integer> node = queue.remove();
            String curWord = node.getKey();
            int curLevel = node.getValue();
            for (int i = 0; i < len; i++) {
                String pipeiStr = curWord.substring(0,i) + "*" + curWord.substring(i+1, len);
                ArrayList<String> pipeiList = tongpeiStr.getOrDefault(pipeiStr,new ArrayList<>());
                for (String word : pipeiList) {
                    if(word.equals(endWord))return curLevel + 1;
                    if(!visited.containsKey(word)){
                        queue.add(new Pair<>(word, curLevel + 1));
                        visited.put(word,true);
                    }
                } 
            }
        }
        return 0;
    }
}

// class Solution {
//     public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
//         // 给定单词列表中不包括endword，直接返回
//         if (!wordList.contains(endWord)) return 0;
//         // 题目说明，每个单词长度相同
//         int len = beginWord.length();
//         // 处理给出的单词字典，转换为全部的通用状态及每个通配词映射的单词集合
//         HashMap<String, ArrayList<String>> allComboDict = new HashMap<>();
//         // lambda表达式遍历，currWord是当前正在遍历的单词
//         wordList.forEach(curWord -> {
//             // 每个单词能得到len种通配词(每个位置字符都可变为*)
//             for (int i = 0; i < len; i++) {
//                 // 得到通配词
//                 String comboWord = curWord.substring(0, i) + "*" + curWord.substring(i + 1, len);
//                 // 从通配字典全集中拿到这个通配词对应的单词集合，如果是空(第一次得到通配词时)就创建一个新的
//                 ArrayList<String> comboWordList = allComboDict.getOrDefault(comboWord, new ArrayList<>());
//                 // 把当前这个单词加进去，因此从这个单词得到了这个通配词
//                 comboWordList.add(curWord);
//                 // 更新一个通配字典全集中这个通配词对应的单词集合
//                 allComboDict.put(comboWord, comboWordList);
//             }
//         });
//         // 广度优先遍历队列
//         // LinkedList implements Deque extends Queue
//         Queue<Pair<String, Integer>> queue = new LinkedList<>();
//         // 记录已遍历过的单词,为什么不用List，因为之后判断节点是否已遍历过时，ArrayList的contains方法太低效了，它的底层是数组，或者直接用TreeSet也可以
//         // ArrayList<String> hasVistedList = new ArrayList<>();
//         HashMap<String, Boolean> hasVistedList = new HashMap<>();
//         // 开始词作为第一个节点加入队列,深度level是1，标记其已访问
//         queue.add(new Pair<>(beginWord, 1));
//         // hasVistedList.add(beginWord);
//         hasVistedList.put(beginWord, true);
//         // 广度优先遍历，逐个取出队列中元素进行操作
//         while (!queue.isEmpty()) {
//             // 队列第一个节点
//             Pair<String, Integer> node = queue.remove();
//             // 当前节点对应的<单词，层级>
//             String currWord = node.getKey();
//             int level = node.getValue();
//             for (int i = 0; i < len; i++) {
//                 // 从当前单词，得到len个通配词
//                 String currComboWord = currWord.substring(0, i) + "*" + currWord.substring(i + 1, len);
//                 // 拿到这个通配词映射的单词集合(也就是从当前单词一次转换能得到哪些单词)
//                 ArrayList<String> currComboWordList = allComboDict.getOrDefault(currComboWord, new ArrayList<>());
//                 // 遍历其中是否包含目标单词
//                 for (String word : currComboWordList) {
//                     // 包含目标单词，说明当前单词能一次转换到目标单词，经历的步骤数是当前单词的层级 + 1
//                     if (word.equals(endWord))
//                         return level + 1;
//                     // 否则，当前单词能得到这个单词，如果它还没被访问过
//                     // if (!hasVistedList.contains(word)){
//                     // HashMap.containsKey方法效率远高于ArrayList.contains
//                     if (!hasVistedList.containsKey(word)){
//                         // 把这个单词加入到队列中
//                         queue.add(new Pair<>(word, level + 1));
//                         // 标记它为已访问
//                         // hasVistedList.add(word);
//                         hasVistedList.put(word, true);
//                     }
//                 }
//             }
//         }
//         return 0;
//     }
// }

    // public int minPath = Integer.MAX_VALUE;
    // public HashMap<String, List<String>> predictList;
    // public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    //     if(!wordList.contains(endWord))return 0;
    //     predictList = preHandle(wordList);

    //     HashSet<String> path = new HashSet<>();
    //     path.add(beginWord);
    //     dfs(beginWord, endWord, wordList, path);
    //     System.out.println(path);
    //     return minPath < Integer.MAX_VALUE? minPath : 0;
    // }

    // // 找到了单词，记录路径长度返回
    // // 依次找变换过一个字母的单词
    // // 记录访问过的单词，避免重复访问
    // public void dfs(String beginWord, String endWord, List<String> wordList,HashSet<String> path){
    //     //terminator
    //     if(beginWord.equals(endWord)){
    //         // path.add(beginWord);
    //         if(path.size()< minPath)minPath = path.size();
    //         return;
    //     }

    //     for (int i = 0; i < wordList.size(); i++) {
    //         if(path.contains(wordList.get(i)) || !check(beginWord, wordList.get(i)))continue;
            
    //         path.add(wordList.get(i));
    //         dfs(wordList.get(i), endWord, wordList, path);
    //         path.remove(wordList.get(i));
    //     }

    // }

    // private HashMap<String, List<String>> preHandle(List<String> wordList){
    //     HashMap<String, List<String>> predictList = new HashMap<>();
    //     for (String word : wordList) {
    //         List<String> list = new ArrayList<>();
    //         int wordLen = word.length();
    //         for (int i = 0; i < wordLen; i++) {
    //             String newWord = word.substring(0, i) + '*' + word.substring(i + 1, wordLen);
    //             list.add(newWord);
    //         }
    //         predictList.put(word, list);
    //     }
    //     return predictList;
    // }
    // private boolean check(String first, String second) {
    //     if(!predictList.containsKey(first)){
    //         int wordLen = first.length();
    //         for (int i = 0; i < wordLen; i++) {
    //             String newWord = first.substring(0, i) + '*' + first.substring(i + 1, wordLen);
    //             if(predictList.get(second).contains(newWord)){
    //                 return true;
    //             }
    //         }
    //         return false;
    //     }
    //     for (int i = 0; i < predictList.get(first).size(); i++) {
    //         if(predictList.get(second).contains(predictList.get(first).get(i))){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    

// }