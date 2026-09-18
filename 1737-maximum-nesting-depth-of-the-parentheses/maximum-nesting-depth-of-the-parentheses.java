class Solution {
    public int maxDepth(String s) {
        int max=0,cnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                cnt++;
                max=Math.max(cnt,max);
            }
            else if(ch==')') cnt--;
        }
        return max;
    }
}