function quickSort(arr, left, right) {
    
}

//分割数组
function partition(arr, left, right) {
    if(left >= right)return;
    //选择的对比
    var flag = left;
    var index = flag;
    for(var i = left + 1; i < right; i++ ) {
        if(arr[i] > arr[temp]){
            swap(arr, temp, i);
            temp = i;
        }
    }
}

function swap(arr, i, j){
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}