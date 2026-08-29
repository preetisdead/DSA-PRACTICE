class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;       
        int current = 1; 
        int count = 0;
        
        while (count < k) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                count++; 
                if (count == k) {
                    return current;
                }
            }
            current++;
        }
        
        return current;
    }
}