class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans= new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n){
            int st=intervals[i][0],end=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end=Math.max(end,intervals[j][1]);
                j++;
            }
            ans.add(Arrays.asList(st,end));
            i=j;
        }

        int[][] a=new int[ans.size()][2];
        for(int x=0;x<ans.size();x++){
            for(int y=0;y<2;y++){
                a[x][y]=ans.get(x).get(y);
            }
        }
        return a;
    }
}