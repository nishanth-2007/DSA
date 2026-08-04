class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] contains=new boolean[101];
        int min=nums[0],max=nums[nums.length-1];
        System.out.println(min);
        System.out.println(max);
        for(int i=0;i<nums.length;i++){
            
            contains[nums[i]]=true;
        }
        for(int i=min;i<=max;i++){
            if(!contains[i]) ans.add(i);
        }
        return ans;
    }
}