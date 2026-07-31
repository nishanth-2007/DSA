class Solution {
    public int minimumPushes(String word) {
        int [] arr=new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
        }

        Arrays.sort(arr);
        int cnt=0;
        for(int i=25;i>=0 && arr[i]>0;i--){
            cnt+=arr[i]*((25-i)/8+1);
        }
        return cnt;
    }
}