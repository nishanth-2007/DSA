class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int n:nums){
        hm.put(n,hm.getOrDefault(n,0)+1);
       }
       for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        if(entry.getValue()>nums.length/2) return entry.getKey();
       }
        return -1;
    }
}