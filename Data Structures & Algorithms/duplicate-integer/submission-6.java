class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}