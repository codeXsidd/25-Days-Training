import java.util.*;
import java.io.IOException;
public class Main{
public static void main(String args[]){
try{
File f=new File("test1.txt");
if(f.createNewFile()){
System.out.println("file has been created"+f.getName());
}
else{
System.out.println("file already exist");
}}
catch(IOException e){
System.out.println("error");
e.printStackTrace();
}}}
