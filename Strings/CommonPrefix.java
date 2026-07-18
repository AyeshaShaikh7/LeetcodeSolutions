class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st = strs[0]; //keep first word as st
        String ans = "";
        

        for (int i = 1; i < strs.length; i++) { //outer loop for traversal of array
            String str = strs[i];
            for (int j = 0; j < str.length() && j<st.length(); j++) { //inner loop for traversal of each word
                if (st.charAt(j) == str.charAt(j)) {
                     ans = str.substring(0, j+1);
                } 
                else{
                    break;
                }
            }
            st = ans; 
            ans ="";
        }
        return st;
    }
}
