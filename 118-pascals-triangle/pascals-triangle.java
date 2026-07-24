class Solution {
    public List<Integer> ansRow(int row){
        List<Integer> rowArr=new ArrayList<>();
        int fact=1;
        rowArr.add(fact);
        for(int col=1;col<row;col++){
            fact=fact*(row-col);
            fact=fact/col;
            rowArr.add(fact);
        }
        return rowArr;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(ansRow(i));
        }
        return ans;
    }
}