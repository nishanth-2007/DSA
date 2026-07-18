class Solution {
    public boolean isPossible(int quantities[],int n,int max){
        for(int i=0;i<quantities.length;i++ ) {
            
            int ans=quantities[i]/max;
            if(quantities[i]%max!=0) ans++;
            n-=ans;
            if(n<0) return false;
        }
        return true;

    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=0;
        for(int i=0;i<quantities.length;i++){
            if(quantities[i]>r) r=quantities[i];
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(quantities,n,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}