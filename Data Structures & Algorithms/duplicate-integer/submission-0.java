class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> distinctSet = new HashSet<>();

        for (int i=0; i < nums.length; i++) {
            if (distinctSet.contains(nums[i])) {
                return true;
            }
            distinctSet.add(nums[i]);
        }
        return false;
    }
}
