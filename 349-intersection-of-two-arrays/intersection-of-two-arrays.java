class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> net = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    net.add(nums1[i]);
                    break;
                }
            }

        }
        int a[] = new int [net.size()];
        for(int i=0;i<net.size();i++){
        a[i]=net.get(i);
        }
        int b[]=Arrays.stream(a).distinct().toArray();

        return b;

    }
}