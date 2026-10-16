class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] indices = new int[2];
        // for (int i = 0, j = 1; i < numbers.length; i++) {
        //     if (j < numbers.length - 1 && numbers[i] + numbers[j] == target) {
        //          indices[0] = numbers[i];
        //          indices[1] = numbers[j];
        //     }
        //     i++; j++;
        // }
        // return indices;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int needed = target - numbers[i];
            if (map.containsKey(needed)) {
                int neededIndex = map.get(needed);
                return new int[]{neededIndex, i+1};
            } else {
                map.put(numbers[i], i+1);
            }
        }
        return new int[0];
    }
}
