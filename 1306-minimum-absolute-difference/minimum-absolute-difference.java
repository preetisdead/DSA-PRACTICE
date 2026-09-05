class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
     
     Arrays.sort(arr);
        
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            
            if (diff < minDiff) {
                minDiff = diff;
                ans.clear(); // New smaller difference found, drop older pairs
                ans.add(List.of(arr[i], arr[i + 1]));
            } else if (diff == minDiff) {
                ans.add(List.of(arr[i], arr[i + 1]));
            }
        }
        
        return ans;
    }
}