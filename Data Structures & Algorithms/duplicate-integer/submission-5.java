class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0, j = i + 1;
        while (i < nums.length -1) {
            j = i +1;
            while (j <= nums.length - 1) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}