class Solution {
    public long maxAlternatingSum(int[] nums) {
      for(int i=0;i<nums.length;i++){
        nums[i]=Math.abs(nums[i]);
      }
      Arrays.sort(nums);
      long sum=0;
      for(int j=nums.length-1;j>=nums.length/2;j--){
        sum+=nums[j]*nums[j];
      }
         for(int j=0;j<nums.length/2;j++){
        sum-=nums[j]*nums[j];
      }
      return sum;
    }
}