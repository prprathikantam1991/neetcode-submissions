class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0, j = 1; i < n;) {
            if (j >= n) {
                i++;
                j = i + 1;
            } else if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else {
                j++;
            }
        }
        return new int[0];
    }
}
