class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int small=nums[0],large=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small) small=nums[i];
            if(nums[i]>large) large=nums[i];
            System.out.println(small+ " "+large);
        }
        for(int i=small;i<=large;i++){
            boolean exist=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i) exist=true;
            }
            if(!exist) ans.add(i);
        }
        return ans;
    }
}