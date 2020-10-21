class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // name = "alex", typed = "aaleex"
        if(name.charAt(0) != typed.charAt(0))return false;
        int i= 1,j = 1;
        while(i<name.length() && j< typed.length()){
            if(typed.charAt(j) == name.charAt(i)){
                j++;
                i++;
            }else if(typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        if(i == name.length() && j == typed.length())return true;
        if(i < typed.length())return false;

        while(j<typed.length()){
            if(typed.charAt(j) != typed.charAt(j-1)){
                return false;
            }
            j++;
        }
        return true;
    }
}