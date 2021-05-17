/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let nums = [];
    let fun = (root) => {
        root.left && fun(root.left);
        nums.push(root.val);
        root.right && fun(root.right);
    }
    root && fun(root);
    return nums;
    // let numbers = [];
    // inorder(root,numbers);
    // return numbers;


    // function inorder(curNode, numbers){

    //     if(curNode){
    //         if(curNode.left)inorder(curNode.left);
    //         numbers.push(curNode.val);
    //         if(curNode.right)inorder(curNode.right);
    //     }
    // }

    // function TreeNode(val) {
    //     this.val = val;
    //     this.left = this.right = null;
    // }
};

var inOrderTraversal = function(root) {
    if(root == null)return [];

    const number = [];
    function traversal(root){
        root.left && traversal(root.left);
        number.push(root.val);
        root.right && traversal(root.right)
    }
    return number;
}

var priOrderTraversal = function(root) {
    if(root == null)return [];
    const number = [];
    function traversal(root){
        number.push(root.val);
        root.left && traversal(root.left);
        root.right && traversal(root.right);
    }
    return number;
}

var postOrderTraversal = function (root){
    if(!root)return [];
    const number = [];
    function traversal(root){
        root.left && traversal(root.left);
        root.right && traversal(root.right);
        number.push(root.val);
    }
    return number;
}

//1、递归中止条件
//2、当前层的逻辑
//3、drill down
//4、清理现场