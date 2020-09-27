class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)return false;
        int row = matrix.length;
        int column = matrix[0].length;
        if(row ==1 && column == 1)return matrix[0][0] == target;

        int left = 0, right = row * column -1;
        while(left <= right){
            int mid = (left + right)/2;

            //二维矩阵元素的值
            int value = matrix[(mid)/column][(mid)%column];
            if(value == target)return true;
            else if(value > target)right = mid-1;
            else left = mid+1; 
        }

        return false;
    }
}