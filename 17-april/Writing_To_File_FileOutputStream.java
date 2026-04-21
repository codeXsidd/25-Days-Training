import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("test3.txt");
            fo.write(65);
            fo.write(67);
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
