class Solution {
    public int possible(int a[],int th,int div){
        int sum=0;
        for(int j=0;j<a.length;j++){
            int x=a[j];
            sum+=(int)Math.ceil((double)x/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }

        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=possible(nums,threshold,mid);
            if(ans<=threshold) high=mid-1;
            else low=mid+1;
        } 
        return low;
    }
}