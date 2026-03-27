import java.util.*;

public class Main{
    public static void main(String[] args){
        String str="Hi_Guys_  HHH_Hi_Guy";
        for(int i=0;i<str.length();i++){
            boolean flag=false;
            char ch=str.charAt(i);
            for(int j=0;j<i;j++){
                if(str.charAt(j)==ch){
                    flag=true;
                    break;
                }
            }
            if(flag)continue;
            int count=1;
            for(int k=i+1;k<str.length();k++){
                if(str.charAt(k)==ch)count++;
            }
            if(str.charAt(i)==' ')System.out.println(" "+count);
            else System.out.println(ch+": "+count);
        }
    }
}
