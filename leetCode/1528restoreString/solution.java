class Solution {
    public String restoreString(String s, int[] indices) {
        //char[] newStr = new char[s.length()];
        char[] result = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }

        return new String(result);
    }
}