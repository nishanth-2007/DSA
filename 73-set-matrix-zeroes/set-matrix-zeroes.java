class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            arr1[i]=0;
            arr2[j]=0;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    arr1[i]=1;
                    arr2[j]=1;
                }
            }
        }

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==1 || arr2[j]==1)
                matrix[i][j]=0;
            }
        }
    }
}