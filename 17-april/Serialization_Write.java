import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Julie",1, 25);
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("test4.txt"));
            obj.writeObject(s1);
            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
