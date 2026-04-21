import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("test3.txt");
            int ch;
            while ((ch = f.read()) != -1) {
                System.out.println((char) ch);
            }
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
