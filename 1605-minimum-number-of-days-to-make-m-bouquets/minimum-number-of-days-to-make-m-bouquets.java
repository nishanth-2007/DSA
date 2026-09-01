class Solution {
    public boolean fun(int[] a,int day,int m,int k){
        int noB=0;
        int cnt=0;
        for(int j=0;j<a.length;j++){
            if(a[j]<=day) {
                cnt++;
            }
            else {
                noB+= (cnt/k);
                cnt=0;
            }
        }
        noB+=(cnt/k);
        if(noB>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length< (long) m*k) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        int low=min,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(fun(bloomDay,mid,m,k)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}