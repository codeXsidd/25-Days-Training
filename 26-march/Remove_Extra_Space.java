import java.util.*;

public class Main{
    public static void main(String[] args){
         String str="Hi    Hello    Great";
        String s="";
        Boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ' ){
                s=s+str.charAt(i);
                flag=true;
            }
            else if(flag){
                s=s+' ' ;
                flag=false;
            }
        }
        System.out.println(s);
    }
}
