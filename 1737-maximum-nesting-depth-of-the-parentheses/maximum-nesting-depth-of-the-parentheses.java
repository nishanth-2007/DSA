class Solution {
    public int maxDepth(String s) {
        int max=0;
        Stack <Character> st=new  Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push('(');
                max=Math.max(max,st.size());
            }
            else if(c==')') st.pop();
        }
        return max;
    }
}