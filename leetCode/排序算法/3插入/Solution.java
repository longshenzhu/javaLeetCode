import java.util.Arrays;

class Solution {
    public int[] insertionSort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        if (array == null || array.length <=1)return array;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j-1] > temp) {
                array[j] = array[j-1];
                j --;
            }
            // 插入
            if (j != i) {
                array[j] = temp;
            }
        }
        return array;
    }
}