class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> st=new HashSet<>();
                for(int k=j+1;k<n;k++){
                   long fourth=(long) target- nums[i]-nums[j]-nums[k];
                   if(fourth>=Integer.MIN_VALUE && fourth<=Integer.MAX_VALUE && st.contains((int)fourth)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        if(!ans.contains(temp)) ans.add(temp);
                   }
                   st.add(nums[k]);
                }
            }
        }
        return ans;
    }
}