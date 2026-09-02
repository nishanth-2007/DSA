class Solution {
    public int fun(int a[],int days,int cap){
        int day=1,load=0;
        for(int j=0;j<a.length;j++){
            if(load+a[j]>cap){
                day++;
                load=a[j];
            }
            else{
                load+=a[j];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max) max=weights[i];
            sum+=weights[i];
        }

        int low=max,high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysReq=fun(weights,days,mid);
            if(daysReq<=days) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}