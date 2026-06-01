class Solution {
    public int[] runningSum(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=0;j<=i;j++){
                s+=nums[j];
            }
            ans[i]=s;
        }
         return ans;
    }
   
}