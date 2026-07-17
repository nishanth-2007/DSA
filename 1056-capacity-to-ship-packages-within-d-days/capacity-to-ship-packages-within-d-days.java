class Solution {
    public boolean isPossible(int[] nums,int days,int maxCapacity){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxCapacity) return false;
            if(sum+nums[i]>maxCapacity){
                days-=1;
                sum=0;
            }
            
            sum+=nums[i];
            if(days<=0) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}