class Solution {
    public int findNumbers(int[] nums) {
        int co=0;
        for(int i=0;i<nums.length;i++){
            if(count(nums[i])%2==0){
                co++;
            }
        }
        return co;
    }
    int count(int x){
        int c=0;
       while(x!=0){
        int d=x%10;
        x=x/10;
        c++;
       }
       return c;
    }
}