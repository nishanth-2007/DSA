class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int[] temp=new int[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            temp[i]=i;
        }

        for(int i=0;i<temp.length;i++){
            boolean result=false;

            for(int j=0;j<nums.length;j++){
                if(temp[i]==nums[j]){
                    result=true;
                    break;
                }
            }

            if(!result){
                ans=temp[i];
            }
        }
        return ans;
        
    }
}