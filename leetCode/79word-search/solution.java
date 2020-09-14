class Solution {
    //1.下一个字母必须在相邻位置
    //2.字母不能重复使用
    public boolean exist(char[][] board, String word) {
        return true;
    }

    //i,j记录字母在二维表中的位置, visited记录访问过的位置,level记录单词的字母位置
    public boolean backTrace(String word, int level,int i,int j, char[][] board, Boolean[][] visited){
        //1.terminator: 
        if(level> word.length())return true;

        //2.process conrrent logic
        char charactor = word.charAt(level);
        //寻找该字母：1.判断是否访问过 2.找到后更新visited的值

        //3.drill down
        if(getChar(i,j, charactor, board)){
            backTrace(level+1, location, board, word);
        }else{

        }

        //4.restore status

        return false;
    }

    private boolean getChar(int i,int j, char charactor, char[][] board, Boolean[][] visited) {
        int m = board.length;      //行数
        int n = board[0].length;   //列数
        if(i>0 && board[i-1][j] == charactor && visited[i-1][j] == false)return true;
        if(i<m-1 && board[i+1][j] == charactor)return true;
        if(j>0 && board[i][j-1] == charactor) return true;
        if(j< n-1 && board[i][j+1] == charactor) return true;

        return false;
    }
}