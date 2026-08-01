class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=nums[j];
                    
                
                maxProduct=Math.max(product,maxProduct);
                if(nums[j]>maxProduct) maxProduct=nums[j];
            }
        }
        return maxProduct;
    }
}