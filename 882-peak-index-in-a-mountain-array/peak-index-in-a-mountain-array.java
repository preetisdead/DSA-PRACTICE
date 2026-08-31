class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            n[i]=arr[i];
        }
        Arrays.sort(n);
        int target=n[arr.length-1];
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            c=i;
        }
        return c;
    }


}