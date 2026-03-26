import java.util.*;

public class Main{
    public static void main(String[] args){
        String str="------Hello----Hi---";
        char[] s=str.toCharArray();
        int count=0;
        Boolean flag=false;
        for(char c:s){
            if(c!='-'){
                flag=true;
            }
            else{
                if(flag){
                    count++;
                    flag=false;
                }
            }
        }
        if(flag)count++;
        System.out.println(count);
    }
}
