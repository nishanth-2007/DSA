class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> ans=new HashMap<>();
        int l=0,max=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            ans.put(c,ans.getOrDefault(c,0)+1);
            while(ans.get(c)>2){
                char leftChar=s.charAt(l);
                ans.put(leftChar,ans.get(leftChar)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}