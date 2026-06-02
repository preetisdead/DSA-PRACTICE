class Solution {
    public int largestAltitude(int[] gain) {
        int c=0;
        int s[]=new int[gain.length+1];
        s[0]=0;
        for(int i=0;i<gain.length;i++){
            c=gain[i]+c;
            s[i]=c;
        }
        int m=0;
        for(int i=0;i<gain.length+1;i++){
            m=Math.max(m,s[i]);
        }
        return m;
    }
}