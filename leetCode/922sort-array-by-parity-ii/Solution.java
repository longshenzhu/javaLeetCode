class Solution {
    public int[] sortArrayByParityII(int[] A) {
        //[4,2,5,7]
        //双指针
        if(A.length < 2)return A;
        int even = 0, odd = 1;
        while(even < A.length && odd < A.length){
            while(even < A.length && A[even] % 2 == 0){
                even += 2;
            }
            if(even > A.length -1)return A;
            while(odd < A.length && A[odd] % 2 == 1) {
                odd += 2;
            }
            if(odd > A.length -1)return A;
            
            //交换
            int temp = A[even];
            A[even] = A[odd];
            A[odd] = temp;
            
            odd += 2;
            even += 2;
        }
        return A;
    }
}