class Solution {
    public int threeSumClosest(int[] nums, int target) {
         Arrays.sort(nums);
          int maxdiff=Integer.MAX_VALUE;
      int res=0;
    for(int i=0;i<nums.length-2;i++){
      int l=i+1;
      int r=nums.length-1;
     
        while(l<r){
            int sum=nums[l]+nums[r]+nums[i];
            int diff=Math.abs(sum-target);
            if(diff<maxdiff){
                maxdiff=diff;
                res=sum;
            }
            if(sum==target){
           
            l++;
            r--;
               
            }
           else if(sum>target)
            r--;
           else 
           l++;
        }

    }
   return res;
    }
}