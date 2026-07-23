class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m=matrix.length,n=matrix[0].length;
        int left=0,right=n-1,top=0,btm=m-1;

        while(left<=right && top<=btm){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=btm;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top<=btm){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[btm][i]);
                }
                btm--;
            }

            if(left<=right){
                for(int i=btm;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}