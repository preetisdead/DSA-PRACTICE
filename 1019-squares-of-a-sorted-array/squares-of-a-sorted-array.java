class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int [nums.length];
        int ind=nums.length-1;
        for(int k=0;k<nums.length;k++){
            nums[k]=nums[k]*nums[k];
        }
        int i=0,j=nums.length-1;
        while(i!=j){
            if(nums[i]>nums[j]){
            ans[ind]=nums[i];
            ind--;
            i++;
        }
        else{  
            ans[ind]=nums[j];
            ind--;
            j--;
        }
    }
    ans[0]=nums[j];
    return ans;
}
   
}