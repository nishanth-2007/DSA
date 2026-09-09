class Solution {
    public boolean isPossible(int nums[],int k,int maxSum){
        int splitCnt=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(maxSum<nums[i]) return false;
            if(sum+nums[i]>maxSum){
                splitCnt++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(splitCnt<=k) return true;
        else return false;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MAX_VALUE, high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<low) low=nums[i];
            high+=nums[i];
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums,k,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}