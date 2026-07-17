class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else pos.add(nums[i]);
        }
        
        for(int j=0;j<nums.length/2;j++){
            nums[j*2]=pos.get(j);
            nums[j*2+1]=neg.get(j);
        }
        return nums;
    }
}