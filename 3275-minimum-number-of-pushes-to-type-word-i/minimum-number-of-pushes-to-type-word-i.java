class Solution {
    public int minimumPushes(String word) {
        int len=0;
        for(int i=0;i<word.length();i++){
            len+=i/8+1;
        }
        return len;
    }
}