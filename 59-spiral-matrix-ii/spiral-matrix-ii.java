class Solution {
    public int[][] generateMatrix(int n) {
         int top = 0, bottom =n-1;
        int left = 0, right =n-1;
        int spiral[][]= new int[n][n];
        int o=1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                spiral[top][i]=o++;
            top++;

            for (int j = top; j <= bottom; j++)
                spiral[j][right]=o++;
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    spiral[bottom][k]=o++;
                bottom--;
            }

            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    spiral[l][left]=o++;
                left++;
            }
        }

        return spiral;
    }
}