class Solution {
    public String expandString(String str,int l,int r){
        while(l>=0 && r<str.length() && str.charAt(l)==str.charAt(r)){
            l--;
            r++;
        }
        return str.substring(l+1,r);
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;

        int maxLen=1;
        String maxPalindrome=s.substring(0,1);

        for(int i=0;i<s.length();i++){
            String odd=expandString(s,i,i);
            String even=expandString(s,i,i+1);

            if(odd.length()>maxPalindrome.length()){
                maxPalindrome=odd;
            }

            if(even.length()>maxPalindrome.length()){
                maxPalindrome=even;
            }
        }

        return maxPalindrome;
    }
}