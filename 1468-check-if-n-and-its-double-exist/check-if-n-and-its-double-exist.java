class Solution {
    public boolean checkIfExist(int[] arr) {
        int a[]=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==2*arr[j]&&i!=j)
                return true;
            }
        }
        return false;
    }
}