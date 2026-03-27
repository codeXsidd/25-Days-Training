import java.util.*;
public class Main{
  public static void main(String[] args){
    String str = "Hi Hello Good";
    boolean flag = true;
    for(int i=0;i<str.length();i++){
       char ch = str.charAt(i);
      if(ch!=' '){
       if(flag){
         count++;
         flag=false;
       }
      }
      else{
        flag = true;
      }
    }
    System.out.print(count);
  }
}
