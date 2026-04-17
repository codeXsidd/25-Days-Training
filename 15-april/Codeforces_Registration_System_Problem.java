// https://codeforces.com/problemset/problem/4/C
import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
HashMap<String,Integer>map=new HashMap<>();
for(int i=0;i<n;i++){
String a=sc.next();
if(!map.containsKey(a)){
System.out.println("OK");
map.put(a,1);
}else{
int count=map.get(a);
System.out.println(a+count);
map.put(a,count+1);
}
}
}
}
