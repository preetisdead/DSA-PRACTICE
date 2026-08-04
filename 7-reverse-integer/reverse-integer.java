class Solution {
    public int reverse(int x) {
        long ans=0;
        int curr_val=0;
        if(x<=Integer.MAX_VALUE||x>=Integer.MIN_VALUE){
            while(x!=0){
            curr_val=x%10;
            x/=10;
            ans=ans*10+curr_val;
        }
        if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE) return 0;
       
        }
         return (int)ans;
    }
}
