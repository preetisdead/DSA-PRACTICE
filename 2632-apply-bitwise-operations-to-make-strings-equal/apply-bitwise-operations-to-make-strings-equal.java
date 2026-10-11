class Solution {
    public boolean makeStringsEqual(String s, String target) {
       int l=s.length();
       int c=0,n=0;int i=0;
        while(i<l){
            if(s.charAt(i)=='0'){
            c++;
            }
            if(target.charAt(i)=='0'){
             n++;
            }
            i++;
        } 
        if(c==l&&n==l) return true;
        else if(c==l|n==l) return false;
        else return true;
    }
}