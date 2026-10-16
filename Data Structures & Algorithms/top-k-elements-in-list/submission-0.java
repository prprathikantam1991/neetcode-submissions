class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int n : nums) {
            numberMap.put(n, numberMap.getOrDefault(n, 0) + 1 );
        }

        Map<Integer, Integer> sortedMap = numberMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue,
            LinkedHashMap::new
        ));

        int[] topFrequent = new int[k];
        int i = 0;
        for (int key : sortedMap.keySet()) {
            topFrequent[i++] = key;
            if (i == k) {
                break;
            }
        }
        return topFrequent;
    }
}
