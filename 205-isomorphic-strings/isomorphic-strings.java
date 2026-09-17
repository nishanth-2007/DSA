class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> sh=new HashMap<>();
        HashMap<Character,Integer> th=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!sh.containsKey(s.charAt(i))) sh.put(s.charAt(i),i);

            if(!th.containsKey(t.charAt(i))) th.put(t.charAt(i),i);

            if(!sh.get(s.charAt(i)).equals(th.get(t.charAt(i)))) return false;
        }        
        return true;
    }
}