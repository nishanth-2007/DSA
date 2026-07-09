class Solution {
    public int missingNumber(int[] nums) {
        int actual=0;
        int given=0;
        
        for(int i=0;i<nums.length;i++){
            given+=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            actual+=i;
        }

        return actual-given;
    }
}