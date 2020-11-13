import java.util.Arrays;

class Solution {
    public int[] insertionSort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        if (array == null || array.length <=1)return array;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j-1] <array[j]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
}