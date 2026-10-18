class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int resLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            
            while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (resLength < r - l + 1) {
                    res = s.substring(l, r + 1);
                    resLength = r - l + 1;
                } 
                r++;
                l--;
            }

            // even length
            l = i;
            r = i + 1;
            
            while (l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (resLength < r - l + 1) {
                    res = s.substring(l, r + 1);
                    resLength = r - l + 1;
                } 
                r++;
                l--;
            }
        }
        return res;
    }
}
