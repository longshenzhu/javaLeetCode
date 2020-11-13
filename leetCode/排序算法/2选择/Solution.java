import java.util.Arrays;

class Solution {
    public int[] SelectionSort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        //总共经过length - 1 轮比较
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }

            if (i != min) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
  
        }
        return array;
    }
}