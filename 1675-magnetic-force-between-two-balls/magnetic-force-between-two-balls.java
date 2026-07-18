class Solution {
    public boolean isPossible(int position[],int m,int k){
         int x=position[0];
            m--;
            System.out.println(m);
        for(int i=0;i<position.length;i++){
           
            int y=position[i];
            if(y-x>=k){
                m-=1;
                x=y;
            }
        }

        if(m<=0) return true;
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int r=0;
        for(int i=0;i<position.length;i++){
            if(position[i]>r) r=position[i];
            
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(position,m,mid)) l=mid+1;
            else r=mid-1;
        }
        return r;
    }
}