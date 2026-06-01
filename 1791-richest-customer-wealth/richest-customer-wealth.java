class Solution {
    public int maximumWealth(int[][] accounts) {
        int x=0;
      int s[]=new int[accounts.length];
      for(int i=0;i<accounts.length;i++){
        for(int j=0;j<accounts[i].length;j++){
        s[i]+=accounts[i][j];
        }
       x=Math.max(x,s[i]);
      }
     return x;
    }
}