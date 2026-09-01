class Solution {
    public long fun(int cnt,int piles[]){
        long total=0;
        for(int j=0;j<piles.length;j++){
            int a=piles[j];
            total+=(int)Math.ceil((double)a/cnt);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int len=piles.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long req=fun(mid,piles);
            if(req<=h){
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }
}