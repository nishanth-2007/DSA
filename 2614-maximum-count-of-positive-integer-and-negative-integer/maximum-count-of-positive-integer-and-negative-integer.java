class Solution {
    public int leftMost(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target) r=mid-1;
            else l=mid+1;
        }
        return l;
    }

    public int rightMost(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return r;
    }

    public int maximumCount(int[] nums) {
        int target=0;
        int a=leftMost(nums,target);
        int b=rightMost(nums,target);
        int countP=nums.length-(b+1);
        int countN=a;
        return Math.max(countP,countN);
    }
}