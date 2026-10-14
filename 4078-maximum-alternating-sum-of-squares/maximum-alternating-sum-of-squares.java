class Solution {
    public long maxAlternatingSum(int[] nums) {
      for(int k=0;k<nums.length;k++){
        nums[k]=Math.abs(nums[k]);
      }
      Arrays.sort(nums);
      long sum=0;
      int i=0,j=nums.length-1;
      while(i!=j&&i<j){
        sum+=nums[j]*nums[j];
        sum-=nums[i]*nums[i];
        i++;
        j--;
      }
      if(i==j)
      sum+=nums[j]*nums[j];

      return sum;
    }
}