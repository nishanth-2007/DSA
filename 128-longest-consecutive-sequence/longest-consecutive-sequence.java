class Solution {
    public int longestConsecutive(int[] nums) {
       int ans=1;
       int count=1;
       Arrays.sort(nums);
        if(nums.length==0) return 0;
       int lastSmaller=nums[0];

       for(int i=0;i<nums.length;i++){
            if(nums[i]==lastSmaller) continue;
            if(nums[i]-lastSmaller==1){
                count++;
                lastSmaller=nums[i];
            }
            if(nums[i]-lastSmaller>1){
                count=1;
                lastSmaller=nums[i];
            }
            ans=Math.max(ans,count);
        }
       return ans;
    }
}