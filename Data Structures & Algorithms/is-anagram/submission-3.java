class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArray = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            if (sArray[t.charAt(i) - 'a'] == 0) {
                return false;
            } else {
                sArray[t.charAt(i) - 'a'] -= 1;
            }
        }
        return true;
     }
}
