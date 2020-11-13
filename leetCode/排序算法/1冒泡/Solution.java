import java.util.Arrays;

class Solution {
    public int[] BubbleSort(int[] sourceArray) {
        if (sourceArray == null || sourceArray.length <=1)return sourceArray;
        // 对 arr 进行拷贝，不改变参数内容
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        //比较length-1轮即可
        for (int i = 1; i < array.length; i++) {
            //标记是否已经有序
            boolean flag = true;
            for (int j = 0; j < array.length-i; j++) {
                if (array[j] > array[j +1 ]) {
                    //交换
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                    //发生了交换
                    flag = false;
                }  
            }

            if (flag) {
                break;
            }
        }
        return array;
    }
}