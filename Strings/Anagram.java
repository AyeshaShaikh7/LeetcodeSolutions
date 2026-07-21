class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){ //storing freq of each char of string s in map mp
            char key = s.charAt(i);
            int freq =1;
            if(mp.containsKey(key)){
             freq = mp.get(key);
              freq++;
              mp.put(key,freq);
            }
            else{
                mp.put(key,freq);
            }
        }
        for(int i=0;i<t.length();i++){
            int freq =1;
            if(mp.containsKey(t.charAt(i))){// checking if char of string t exist in map mp
              freq = mp.get(t.charAt(i));
                freq--;
                mp.put(t.charAt(i),freq);
            }
            else{
                return false;
            }
            if(freq<0){ //if a particular character's freq of string t is more than string s
                return false;
            }
        }
        return true;
    }
}
