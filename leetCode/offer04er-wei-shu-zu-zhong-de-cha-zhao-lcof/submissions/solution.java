class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)return false;

        int row = matrix.length;
        
        int startRow = 0;
        int startColumn = matrix[0].length -1;

        while(startRow < row && startColumn >= 0){
            if(matrix[startRow][startColumn] == target)return true;
            
            while(startColumn >= 0 && matrix[startRow][startColumn] > target){
                startColumn --;
            }
            
            if(startColumn < 0)return false;
            while(startRow <row && matrix[startRow][startColumn] < target){
                startRow++;
            }
        }
        return false;
    }
}