import sun.reflect.generics.tree.Tree;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)return false;
        int row = matrix.length;
        int column = matrix[0].length;

        int startRow = 0;
        int startColumn = column -1;

        while(true){
            if(matrix[startRow][startColumn] == target)return true;
            
            while(matrix[startRow][startColumn] > target){
                startColumn --;
            }
            
            while(matrix[])
        }
        

        
    }

    // public boolean searchMatrix(int[][] matrix, int target,int startRow, int startColumn){
    //     for (int i = 0; i < matrix.length; i++) {
            
    //     }
    // }

    
}