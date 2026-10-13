class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int left=1 ; left< nums.length ; left++){
            for(int right= left ; right< nums.length ; right++){
                if(nums[right-left] + nums[right] == target) return new int[]{right-left, right };
            }
        }
        
       return new int[]{};
    }
}