class Solution {
    public int rec(int arr[],int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) return mid;
        else if(target>arr[mid]) return rec(arr,mid+1,high,target);
        else return rec(arr,low,mid-1,target);
    }
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        return rec(nums,l,r,target);
    }
}