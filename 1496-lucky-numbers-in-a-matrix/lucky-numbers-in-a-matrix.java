class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
      ArrayList<Integer> MinRow=new ArrayList<>();
      ArrayList<Integer> MaxCol=new ArrayList<>(); 
      ArrayList<Integer> Res=new ArrayList<>();
      int m=matrix.length;
      int n=matrix[0].length;
      for(int i=0;i<m;i++){
        int min=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            min=Math.min(min,matrix[i][j]);
        }
        MinRow.add(min);
      }
      for(int i=0;i<n;i++){
        int max=Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
            max=Math.max(max,matrix[j][i]);
        }
        MaxCol.add(max);
      }
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j]==MinRow.get(i)&&matrix[i][j]==MaxCol.get(j)){
               Res.add(matrix[i][j]);
            }
        }
      }
      return Res;
    }
}