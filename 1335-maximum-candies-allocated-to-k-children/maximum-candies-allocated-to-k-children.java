class Solution {
    public boolean isPossible(int[] candies,long k,int ans){
        for(int i=0;i<candies.length;i++){
            if(candies[i]==ans) k--;
            if(candies[i]>ans){
                int temp=candies[i]/ans;
                k-=temp;
            }
            if(k<=0) return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>r) r=candies[i];
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(candies,k,mid)) l=mid+1;
            else r=mid-1;
        }
        return r;
    }
}