class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0)return false;
        if(num < 2)return true;
        long left = 2, right = num/2, mid, square;
        while(left <= right){
            mid = (left + right) /2;
            square = mid * mid;
            if(square == num) return true;
            if(square > num){
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }

    // public boolean isPerfectSquare(int num) {
    //     if(num < 0)return false;
    //     if(num < 2)return true;
    //     long left = 2, right = num/2, mid, devide;
    //     while(left <= right){
    //         mid = (left + right) /2;
    //         devide = num/mid;
    //         if(devide == mid) return true;
    //         if(devide > mid){
    //             right = mid -1;
    //         }else{
    //             left = mid+1;
    //         }
    //     }
    //     return false;
    // }
}