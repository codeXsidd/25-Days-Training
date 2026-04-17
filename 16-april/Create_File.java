import java.io.File;
import java.io.IOException;
public class createfile{
    public static void main(String[] args){
        try{
            File f=new File("test2.txt");
            if(f.createNewFile()){
                    System.out.println("file has Created "+f.getName());
            }
            else{
                System.out.println("file already exists");
            }

        }
        catch(IOException e){
            System.out.println("error occur");
        }
        
    }
}
