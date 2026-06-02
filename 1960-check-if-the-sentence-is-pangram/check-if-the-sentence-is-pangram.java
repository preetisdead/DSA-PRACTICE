class Solution {
    public boolean checkIfPangram(String sentence) {
        int c=0;
       for(char ch='a';ch<='z';ch++){
        if(sentence.indexOf(ch)==-1){
            c++;
        }
       }
       if(c==0){
       return true;
       }else{
        return false;
       }
    }
}