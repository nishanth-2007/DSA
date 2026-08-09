class Solution {
    public int findMin(int[] nums) {
        // int low=0,high=nums.length-1;
        // int min=Integer.MAX_VALUE;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(low>high){
        //         min=Math.min(nums[high],min);
        //         low=mid+1;
        //     }
        //     else{
        //         min=Math.min(min,nums[low]);
        //         high=mid-1;
        //     }
        // }
        // return min;

        Arrays.sort(nums);
        return nums[0];
    }
}