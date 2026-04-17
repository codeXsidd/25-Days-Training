class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m1=new HashMap<>();
        Map<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(m1.containsKey(a)){
                if(m1.get(a)!=b){
                    return false;
                }
            }
            else{
                m1.put(a,b);
            }

            if(m2.containsKey(b)){
                if(m2.get(b)!=a){
                    return false;
                }
            }
            else{
                m2.put(b,a);
            }
        }
        return true;
        
    }
}
