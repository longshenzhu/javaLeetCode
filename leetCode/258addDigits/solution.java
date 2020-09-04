class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int digit = num%10;
        return addDigits(digit + (num-digit)/10);
    }
}