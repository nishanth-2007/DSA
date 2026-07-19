class Solution {
    public boolean isPossible(int nums[],int maxOp,int k){
        for(int i=0;i<nums.length;i++){
            int temp=nums[i]/k;
            if(nums[i]%k!=0) temp++;
            maxOp=maxOp-(temp-1);
            if(maxOp<0) return false;
        }
        return true;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>r) r=nums[i];
        }

        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,maxOperations,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}