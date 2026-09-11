class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int low=0,high=(m*n)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ri=mid/n,ci=mid%n;
            if(matrix[ri][ci]==target) return true;
            else if(matrix[ri][ci]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}