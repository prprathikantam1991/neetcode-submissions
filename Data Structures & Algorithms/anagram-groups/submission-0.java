class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(s);
            } else {
                List<String> list = new ArrayList<>(); 
                list.add(s);
                map.put(sortedString, list);
            }
        }
        List<List<String>> groupAnagrams = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            groupAnagrams.add(entry.getValue());
        }
        return groupAnagrams;
    }
}
