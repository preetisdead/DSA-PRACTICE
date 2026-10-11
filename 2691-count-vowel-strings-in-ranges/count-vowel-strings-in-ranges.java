class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[]=new int[queries.length];
        int pref[]=new int[words.length+1];
         pref[0]=0;
        for(int i=0;i<words.length;i++){
            pref[i+1]=pref[i]+(isvowel(words[i])?1:0);
        }
        for(int i=0;i<queries.length;i++){
            int r=queries[i][0];
            int l=queries[i][1];
            ans[i]=pref[l+1]-pref[r];

        }
        return ans;
        
    }
    boolean isvowel(String a){
        char t1=a.charAt(0);char t2=a.charAt(a.length()-1);
        if("aeiou".indexOf(t1)!=-1&&"aeiou".indexOf(t2)!=-1)
        return true;
        else
        return false;
    }
}