class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=Arrays.stream(aliceSizes).sum();
        int sumB=Arrays.stream(bobSizes).sum();
        int i=0,j=0;
        int x=0,y=0;
        for(i=0;i<aliceSizes.length;i++){
            for(j=0;j<bobSizes.length;j++){
                if(aliceSizes[i]==bobSizes[j]+(sumA-sumB)/2){
                 x=aliceSizes[i];
                 y=bobSizes[j];
                }
           }
        }
       return new int[]{x,y}; 
    }
}