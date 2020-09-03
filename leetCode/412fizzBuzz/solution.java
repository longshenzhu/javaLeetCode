
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%15 == 0){
                strings.add("FizzBuzz");
            }else
            if(i%3 == 0){
                strings.add("Fizz");
            }else
            if(i%5 == 0){
                strings.add("Buzz");
            }else{
                // strings.add("" + i);
                strings.add(Integer.toString(i));
            }
            
        }
        return strings;
    }
}