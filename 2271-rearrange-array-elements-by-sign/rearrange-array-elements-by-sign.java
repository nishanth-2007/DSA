class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            if(nums[i]>0 && pos<=ans.length-2){
                ans[pos]=nums[i];
                pos+=2;
            }
            else if(nums[i]<0 && neg<=ans.length-1){
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }
}