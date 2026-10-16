class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        for (int l = 0, r = 0; l <= s.length() - 1; ) {
            char rc = s.charAt(r);
            char lc = s.charAt(l);
            if (set.contains(rc)) {
                set.remove(lc);
                l++;
            } else {
                set.add(rc);
                maxLength = Math.max(maxLength, set.size());
                r++;
            }

            if (r > s.length() - 1) {
                break;
            }
        }
        return maxLength;
    }
}
