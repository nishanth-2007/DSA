class Solution {
    public boolean isPossible(int nums[],int k,int max){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) return false;
            if(temp+nums[i]>max){
                temp=0;
                k--;
            }
            temp+=nums[i];
            if(k<=0) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r= Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,k,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}