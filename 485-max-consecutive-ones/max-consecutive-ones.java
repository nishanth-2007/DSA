class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            count++;
            if(nums[i]!=1){
                count=0;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}