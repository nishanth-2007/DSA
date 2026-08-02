class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
                nums[index]=nums[i];
                index++;
            } 
        }
        return index;

    }
}