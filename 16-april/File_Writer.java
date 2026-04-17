import java.io.File;
import java.io.FileWriter;

public class Main{
  public static void main(String[] args){
    //First
    File f=new File("testing.txt");
    f.createNewFile();
    FileWriter fw=new FileWriter(f);

    //Second
    FileWriter fw=new FileWriter("testing.txt");
    fw.write("Hello");
    fw.close();

    //Third
     FileWriter fw=new FileWriter("testing.txt"); //Automatically new file created if it doesn't exist
  }
}
