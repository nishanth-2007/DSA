class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int ps=0;
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int remove=ps-k;
            if(hm.containsKey(remove)){
                count+=hm.get(remove);
            }
            hm.put(ps,hm.getOrDefault(ps,0)+1);
        }
        return count;
    }
}