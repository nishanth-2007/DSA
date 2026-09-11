class Solution {
    public boolean bs(int matrix[],int target){
        int low=0,high=matrix.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[mid]==target) return true;
            else if(matrix[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        // int i=0,j=n-1;
        // while(i<m && j>=0){
        //     if(matrix[i][j]==target) return true;
        //     else if(matrix[i][j]>target) j--;
        //     else i++;
        // }
        for(int i=0;i<m;i++){
            if(bs(matrix[i],target)) return true;
        }

        return false;
    }
}