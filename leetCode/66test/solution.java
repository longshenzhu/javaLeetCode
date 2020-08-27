class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length ==1 && digits[0] ==0){
            digits[0] =1;
            return digits;
        };
        for (int index = digits.length-1; index >=0; index--) {
            if(digits[index] != 9){
                digits[index]++;
                break;
            }
            digits[index] = 0;
            if(index == 0){
                int [] newDigits = new int[digits.length + 1];
                System.arraycopy(new int[]{1}, 0 , newDigits, 0, 1);
                System.arraycopy(digits, 0 , newDigits, 1, digits.length);
                digits = newDigits;
            }
        }
        return digits;
    }
}