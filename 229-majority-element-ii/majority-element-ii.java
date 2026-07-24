class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>nums.length/3) ans.add(entry.getKey());
        }
        return ans;
    }
}