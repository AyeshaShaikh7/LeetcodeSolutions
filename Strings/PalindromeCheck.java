class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        s = s.trim();
        if(s.isEmpty()){
            return "";
        }
        String words[] = s.split("\\s+");    //Very important, it splits sentence into array 
        //eg : string s = mango is sweet. After this it becomes String s[] = {"mango","is","sweet"}
        // Doing this it makes is easier to access using indices of array
        for(int i = words.length-1;i>=0;i--){
         sb.append(words[i]);
         if(i>0){
         sb.append(" "); //for adding space between words
         }
        }
        return sb.toString();
    }
} 
// Brute force would be using the concept of if you encounter a space' ' then add that part of substring in new ans string.
