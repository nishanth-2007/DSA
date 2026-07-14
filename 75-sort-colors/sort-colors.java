class Solution {
    public int[] sort(int[] nums){
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)    c0++;
            else if(nums[i]==1) c1++;
            else c2++;
        }
        for(int a=0;a<c0;a++) nums[a]=0;
        for(int b=c0;b<c0+c1;b++) nums[b]=1;
        for(int c=c0+c1;c<c0+c1+c2;c++) nums[c]=2;
        return nums;
    }
    public void sortColors(int[] nums) {
        sort(nums);
    }
}