class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int ans = 0;
        mp.put('I', 1); //putting the roman numbers in map
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))) { //eg: IV, so I<V ie(1<5)
                ans += mp.get(s.charAt(i + 1)) - mp.get(s.charAt(i)); //hence 5-1=4
                i = i + 1;
            } else {
                ans += mp.get(s.charAt(i));
            }
        }
        return ans;
    }
}
