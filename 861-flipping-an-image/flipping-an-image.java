class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int s[][]=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1,k=0;j>=0;j--,k++){
                if(image[i][j]==1){
                    s[i][k]=0;
                }else{
                    s[i][k]=1;
                }
          }
        }
        return s;
    }
}