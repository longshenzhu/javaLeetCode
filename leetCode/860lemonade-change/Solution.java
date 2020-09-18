class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for (int bill : bills) {
            if(bill == 5)five ++;
            else if(bill == 10){
                if(five == 0)return false;
                five--;
                ten++;
            }
            else{
                if(five> 0 && ten > 0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
        // for (int i = 0; i < bills.length; i++) {
        //     if(bills[i] == 5){
        //         five++;
        //     }else if(bills[i] == 10){
        //         if(five == 0){
        //             return false;
        //         }
        //         ten ++ ;
        //         five --;
        //     }else {
        //         if(five == 0 || (five < 3 && ten==0)){
        //             return false;
        //         }
        //         if(ten == 0){
        //             five -= 3;
        //         }else{
        //             ten--;
        //             five--;
        //         }
        //     }
        // }
        // return true;
    }
}