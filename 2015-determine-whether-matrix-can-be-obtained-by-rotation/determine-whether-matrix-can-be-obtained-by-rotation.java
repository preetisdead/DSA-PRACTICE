class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(target,mat)||check(target,rotate(mat))||check(target,rotate(rotate(mat)))||check(target,rotate(rotate(rotate(mat))))){
            return true;
        }else{
            return false;
        }
    }
    boolean check(int [][]a,int [][]b){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=b[i][j]){
                    c++;
                }
            }
        }
        if(c==0){
     return true;
     }else{
     return false;
     }
    }
    int [][]rotate(int a[][]){
        int [][]s=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                s[j][a.length-1-i]=a[i][j];
            }
        }
        return s;
    }
}