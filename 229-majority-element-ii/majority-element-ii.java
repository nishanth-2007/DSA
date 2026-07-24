class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int maxCount=n/3;

        for(int i=0;i<n;i++){
            int cnt=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]==nums[i]) cnt++;
                
            }
            if(cnt>maxCount && !ans.contains(nums[i])) ans.add(nums[i]);
        }
        return ans;
    }
}