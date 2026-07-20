class Solution {
    public int longestConsecutive(int[] nums) {
       int ans=1;
       
       Set<Integer> st=new HashSet<>();
       if(nums.length==0) return 0;
       for(int i=0;i<nums.length;i++) st.add(nums[i]);
       for(int it:st){
            if(!st.contains(it-1)){
                int count=1;
                int x=it;
                 while(st.contains(x+1)){
                    x=x+1;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
       return ans;
    }
}