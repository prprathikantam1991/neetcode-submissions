class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
HashMap<Integer, Integer> counts = new HashMap<>();
List<Integer>[] freq = new List[nums.length + 1];

for (int i = 0; i < freq.length; i++) {
    freq[i] = new ArrayList<Integer>();
}


for (int i = 0; i < nums.length; i++) {
	counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
}

for (Map.Entry<Integer, Integer> entry: counts.entrySet()) {
	freq[entry.getValue()].add(entry.getKey());
}


int[] result = new int[k];
int counter = 0;

for (int i = freq.length -1; i > 0 && counter < k; i--) {
	List<Integer> countList = freq[i];
	for (int num : countList) {
		result[counter++] = num;
		
		if (counter == k) {
			return result;
		}
	}
}

return result;
}}
