class Solution {
    public int[] plusOne(int[] num) {
        int k=1;
     ArrayList<Integer> list=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            k+=num[i];
            list.add(k%10);
            k=k/10;
        }
        while(k!=0){
            list.add(k%10);
            k=k/10;
        }
        Collections.reverse(list);
        int res[]=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}