
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15 == 0){
                strings.add("FizzBuzz");
                continue;
            };
            if(i%3 == 0){
                strings.add("Fizz");
                continue;
            };
            if(i%5 == 0){
                strings.add("Buzz");
                continue;
            };
            strings.add("" + i);
        }
        return strings;
    }
}