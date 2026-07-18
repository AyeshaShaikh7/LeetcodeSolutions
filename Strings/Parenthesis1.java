class Solution {
    public String removeOuterParentheses(String s) {
        int c1 = 0;
        int c2 = 0;
        int start = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c1++;
            }
            if (s.charAt(i) == ')') {
                c2++;
            }

            if (c1 == c2) {
                //it is primitive
                ans += s.substring(start + 1, i); //start+1 because leaving first ( and till i because as it is 'i' will not be included
                start = i + 1;
            }
        }
        return ans;
    }
}
