import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        for (int num : arr) {
            int curMap = maps.getOrDefault(num, 0);
            maps.put(num, curMap+1);
        }

        HashSet sets = new HashSet<>();
        for (int value : maps.values()) {
            if(sets.contains(value)){
                return false;
            }else{
                sets.add(value);
            }
        }
        return true;
    }
}