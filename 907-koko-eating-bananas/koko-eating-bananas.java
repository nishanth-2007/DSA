class Solution {
    public boolean isPossible(int[] nums,int h,int k){
        for(int i=0;i<nums.length;i++){
            int upper=nums[i]/k;
            if(nums[i]%k!=0) upper++;
            h-=upper;
            if(h<0) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(piles,h,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}