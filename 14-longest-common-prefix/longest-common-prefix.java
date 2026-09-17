class Solution {
    public String longestCommonPrefix(String[] strs) {
        if( strs.length==0) return "";

        Arrays.sort(strs);
        String str1=strs[0],str2=strs[strs.length-1];
        for(int i=0;i< Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)!=str2.charAt(i)) return str1.substring(0,i) ;
        }
        return strs[0];
    }
}