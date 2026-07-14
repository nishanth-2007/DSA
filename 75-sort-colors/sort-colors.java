class Solution {
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    
    public int[] sortColors(int[] nums){
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                m++;
                l++;
            }
            else if(nums[m]==1)  m++;

            else {
                swap(nums,m,h);
                h--;
            }
        }
        return nums;
    }
}