class Solution {
    public int characterReplacement(String s, int k) {
        int maxf = 1, l = 0, r = 0;
        String subString = "";
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            char rc = s.charAt(r);
            char lc = s.charAt(l);

            map.put(rc, map.getOrDefault(rc, 0) + 1);
            maxf = Math.max(maxf, map.get(rc));

            while ((r - l + 1) - maxf > k) {
                map.put(lc, map.getOrDefault(lc, 0) - 1);
                l++;
            }
            r++;
        }
        return s.substring(l , r).length();
    }
}
