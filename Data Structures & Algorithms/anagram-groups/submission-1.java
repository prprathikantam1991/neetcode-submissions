class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> gList = new HashMap<>();
        for (String s : strs) {
            int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
            }

            String key = Arrays.stream(counts)
                               .mapToObj(String::valueOf)
                               .collect(Collectors.joining(","));

            gList.putIfAbsent(key, new ArrayList<String>());
            gList.get(key).add(s);
        }

        return new ArrayList<>(gList.values());
    }
}
