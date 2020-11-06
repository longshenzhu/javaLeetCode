class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length<1) {
            return false;
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0, right = row * column -1;

        while(left <= right){
            int mid = (right + left)/2;
            System.out.println(mid);
            System.out.println(matrix[mid/column][mid%column]);
            if(matrix[mid/column][mid%column] == target) {
                return true;
            } else if(matrix[mid/column][mid%column] > target) {
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }
        return false;
    }
}