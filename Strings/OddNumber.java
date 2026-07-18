class Solution {
    public String largestOddNumber(String num) {
        int character =0;
        for(int i =num.length()-1;i>=0;i--){
           character = num.charAt(i) - '0'; //converting char to int using -'0'
           if(character %2 != 0){           // checking even/odd using int value
            return num.substring(0,i+1);     //returns string
           }
        }
         return "";
    }
}
