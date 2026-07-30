class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat=-1,missing=-1;
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            arr[a]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2) repeat=i;
            if(arr[i]==0) missing=i;
        }

        return new int[] {repeat,missing}; 
    }
}