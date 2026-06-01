class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=1;
        int s[]=new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                s[i]=nums[i/2];
            }else{
                s[i]=nums[i+n-k];
                k++;
            }  
        }
        return s;
    }
}