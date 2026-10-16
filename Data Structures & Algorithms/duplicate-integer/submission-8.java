class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> duplicateSet = new HashSet<>();
       for (int i = 0 ; i <= nums.length - 1; i ++) {
         if (!duplicateSet.add(nums[i])) {
            return true;
         }
       }
       return false;
    }
}