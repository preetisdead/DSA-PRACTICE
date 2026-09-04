class Solution {
    public int largestPerimeter(int[] nums) {
        // 1. Sort elements in ascending order
        Arrays.sort(nums);

        // 2. Traverse from the largest elements down to the smallest
        for (int i = nums.length - 1; i >= 2; i--) {
            // Check triangle inequality: a + b > c where a <= b <= c
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        // 3. Return 0 if no valid triangle is found
        return 0;
    }
}
