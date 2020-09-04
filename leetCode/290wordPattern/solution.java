import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        //使用hashSet来改进
        HashSet<String> set = new HashSet<>();
        String[] array = str.split(" ");
        if (pattern.length() != array.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if (map.containsKey(key)) {
                if (!map.get(key).equals(array[i])) {
                    return false;
                }
            } else {
                // 判断 value 中是否存在
                if (set.contains(array[i])) {
                    return false;
                }
                map.put(key, array[i]);
                set.add(array[i]);
            }
        }
        return true;

        //<1>大神的方法，使用第三方比对
        // String[] words = str.split(" ");
        // if (words.length != pattern.length())
        //     return false;
        // Map index = new HashMap();
        // for (Integer i = 0; i < words.length; ++i)
        //     if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
        //         return false;
        // return true;

        //<2>
        // public boolean wordPattern(String pattern, String str) {
        //     String[] strs = str.split(" ");
        //     if(pattern.length() != strs.length)return false;
        //     Map<Character, String> cache = new HashMap<>();
        //     for(int i=0;i < strs.length; i++){
        //         char temp = pattern.charAt(i);
        //         if(cache.containsKey(temp)){
        //             if(!cache.get(temp).equals(strs[i])){
        //                 return false;
        //             };
        //         }else{
        //             if(cache.containsValue(strs[i])){
        //                 return false;
        //             }
        //             cache.put(temp, strs[i]);
        //         }
        //     }
        //     return true;
    }
    
}