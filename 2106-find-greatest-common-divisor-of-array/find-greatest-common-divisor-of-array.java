class Solution {
    public int gcd(int a,int b){
       while(b!=0){
         int temp=b;
         b=a%b;
         a=temp;
       }
       return a;
    }
    public int findGCD(int[] nums) {
        int small=nums[0];
        int large=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large) large=nums[i];
            if(nums[i]<small) small=nums[i];
         }
         return gcd(large,small);
    }
}