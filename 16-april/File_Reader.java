import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class File_Reader{
    public static void main(String[] args) throws IOException{
            
            FileReader f=new FileReader("Sample2.txt");
            // int ch=f.read();
            // System.out.print((char)ch);
            // only one character at a time

            int ch;
            while((ch=f.read())!=-1){
                System.out.print((char)ch);
            }
            
    }
}
