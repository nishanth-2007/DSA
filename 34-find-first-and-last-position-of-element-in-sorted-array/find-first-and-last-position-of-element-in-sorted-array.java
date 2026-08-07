class Solution {
    public int lowerBound(int[] nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target) high=mid-1;
            else low=mid+1;
        }
        if(low>=nums.length) return -1;
        if(nums[low]!=target) return -1;
        return low;
    }
    public int upperBound(int[] nums,int target){
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        if(high<0) return -1;
        if(nums[high]!=target) return -1;
        return high;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=lowerBound(nums,target);
        int u=upperBound(nums,target);
        return new int[] {l,u};
    }
}