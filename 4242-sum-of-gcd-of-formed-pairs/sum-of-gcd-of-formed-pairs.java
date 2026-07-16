class Solution {
    public int gcd(int a,int b){
       while(b!=0) {
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            prefixGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        int l=0,r=nums.length-1;
        long sumGcd=0;
        while(l<r){
            int g=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
            sumGcd+=g;
            if(r-(l%2)==0) break;
        }
        return sumGcd;
    }
}