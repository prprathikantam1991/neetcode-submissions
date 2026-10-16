class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (sumMap.containsKey(needed)) {
                int neededIndex = sumMap.get(needed);
                return new int[]{neededIndex, i};
            } else {
                sumMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
