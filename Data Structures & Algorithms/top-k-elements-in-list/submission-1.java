class Solution {
    public int[] topKFrequent(int[] numbers, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
		for (int n : numbers) {
			freqMap.put(n, freqMap.getOrDefault(n, 0) +1);
		}
		
		List<Integer>[] buckets = new List[numbers.length + 1];
		for (Integer key: freqMap.keySet()) {
			Integer freq = freqMap.get(key);
			if (buckets[freq] == null) {
				buckets[freq] = new ArrayList<>();
			}
			buckets[freq].add(key); 
		}

		List<Integer> result = new ArrayList<>();
		for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
			if (buckets[i] != null) {
				result.addAll(buckets[i]);
			}
		}
		return result.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }
}
