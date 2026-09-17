class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> rev=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if(!hm.containsKey(sch) && !rev.containsKey(tch)){
                hm.put(sch,tch);
                rev.put(tch,sch);
            }
            else if(hm.containsKey(sch) && hm.get(sch)!=tch || rev.containsKey(tch) && rev.get(tch)!=sch) return false;
        }
        return true;
    }
}