class Solution {
    public int romanToInt(String s) {
        int len=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans=hm.get(s.charAt(len-1));
        for(int i=s.length()-2;i>=0;i--){
            char chNow=s.charAt(i);
            char chNext=s.charAt(i+1);
            if(hm.get(chNow)<hm.get(chNext)){
                ans-=hm.get(chNow);
                System.out.println(i + " " + ans);
            }
            else{
                ans+=hm.get(chNow);
                System.out.println(i + " " + ans);
            }
            
        }
        return ans;
    }
}