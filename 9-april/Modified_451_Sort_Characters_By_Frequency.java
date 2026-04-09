/*
You are given a string s, return the array of unique characters sorted by highest to lowest occurring characters.
If two or more characters have the same frequency, then arrange them in the alphabetical order. 
Examples: 
Input: s = "tree" Output: ['e','r','t'], 
Input s="raaaajj" Output:['a','j','r'].
Characters are sorted by decreasing frequency.
In case of ties, arrange alphabetically.
Constraint: use collection (set,list)
*/
import java.util.*;
public class Main{
public static void main(String[] args){
String s="raaaajj";
Map<Character,Integer> m=new HashMap<>();
for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);
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
System.out.println(l);
}
}
