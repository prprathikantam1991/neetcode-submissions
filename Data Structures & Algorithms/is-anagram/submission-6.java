class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i <= s.length() - 1; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j <= t.length() - 1; j++) {
            tMap.put(t.charAt(j), tMap.getOrDefault(t.charAt(j), 0) + 1);
        }

        // for (char c :  sMap.keySet()) {
        //     if (sMap.get(c) != tMap.get(c)) {
        //         return false;
        //     }
        // }
        if (sMap.equals(tMap)) {
            return true;
        }
        return false;
    }
}
