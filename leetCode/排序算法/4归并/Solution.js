function mergeSort(arr){
    //思路：递归二分、合并有序子序列
    if(arr.length < 2)return arr;
    let middle = Math.floor(arr.length / 2);
    let left = arr.slice(0, middle);
    let right = arr.slice(middle);
    return merge(mergeSort(left),mergeSort(right));
}

function merge(left, right){
    let array = [];
    let i = 0, j = 0;
    while(i< left.length && j < right.length){
        if(left[i] <= right[j]) {
            array.push(left[i]);
            i++;
        }else{
            array.push(right[j]);
            j++;
        }
    }

    while(i < left.length){
        array.push(left[i]);
        i++;
    }
    while(j < right.length){
        array.push(right[j]);
        j++;
    }
    return array;
}
let test = [5,9,8,6,7,2,3,4];
// console.log(mergeSort(test));