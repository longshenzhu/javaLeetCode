/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
    if(!board || board.length ==0)return false;
    let row = board.length;
    let column = board[0].length;

    const visited = new Array(row);    // 二维矩阵记录已访问元素
    for (let i = 0; i < row; i++) {
        visited[i] = new Array(column);
    }

    for (let i = 0; i < row; i++) {
        for (let j = 0; j < column; j++) {
            if(board[i][j] == word[0] && findNext(i,j,0)){
                return true;
            }
                   
        }
    }
    return false;

    //判断能否找到下一个字母
    function findNext(i,j, index) {
        if(index>word.length -1)return true;   //递归结束条件

        //当前节点判断
        if(i< 0 || i> row-1 || j<0 || j > column-1)return false;
        if(visited[i][j] || board[i][j] != word[index])return false;

        visited[i][j] = true;
        //drill down
        let canFindnext = findNext(i,j-1,index+1) || 
                          findNext(i,j+1,index+1) || 
                          findNext(i-1,j,index+1) ||
                          findNext(i+1, j, index+1);
        if(canFindnext)return true;
        visited[i][j] = false;
        return false;

        //错误写法
        // let conChar = word.charAt(index);
        // if(i> row - 1 || j> column - 1)return false;
        // if(i< row && j-1>=0 && j-1<column && board[i][j-1] == conChar){
        //     return findNext(i,j-1,index+1);
        // }
        // if(i< row && j+1<column && board[i][j+1] == conChar){
        //     return findNext(i,j-1,index+1);
        // }
        // if(i-1>=0 && i-1 < row && j< column && board[i-1][j] == conChar){
        //     return findNext(i-1, j, index+1);
        // }
        // if(i+1 < row && j< column && board[i+1][j] == conChar){
        //     return findNext(i+1, j, index+1);
        // }
        // return false;
    }
};