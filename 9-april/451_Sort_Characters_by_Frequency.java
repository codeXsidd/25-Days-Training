import java.util.*;
public class Main{
public static void main(String[] args){
String s="raaaajj";
Map<Character,Integer> m=new HashMap<>();
for(char c:s.toCharArray())
  m.put(c,m.getOrDefault(c,0)+1);
List<Character> l=new ArrayList<>(m.keySet());
for(int i=0;i<l.size();i++){
for(int j=i+1;j<l.size();j++){
char a=l.get(i),b=l.get(j);
if(m.get(b)>m.get(a)||(m.get(b).equals(m.get(a))&&b<a)){
l.set(i,b);
l.set(j,a);
}
}
}
String ans="";
for(char c:l){
for(int i=0;i<m.get(c);i++)
  ans+=c;
}
System.out.println(ans);
}
}
