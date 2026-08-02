class Solution {
    public boolean check(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) index=i+1;
        }
        for(int i=0;i<nums.length-1;i++){
            int cur=nums[(index+i) % nums.length];
            int next=nums[(index+i+1) % nums.length];
            if(cur>next) return false;
            System.out.println(((index+i)%nums.length)+" " +((index+i+1)%nums.length));
        }
        return true;
    }
}