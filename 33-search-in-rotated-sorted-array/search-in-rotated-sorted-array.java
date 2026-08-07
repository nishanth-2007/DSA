class Solution {
    public int search(int[] nums, int target) {
        int val=0;
        boolean exist=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                exist=true;
                val=i;
            }
        }
        if(exist) return val;
        else return -1;
    }
}