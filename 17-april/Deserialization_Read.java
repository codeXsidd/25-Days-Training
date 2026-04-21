import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream("test4.txt"));
            Student s = (Student) obj.readObject();
            System.out.println(s.name + " " + s.rno + " " + s.age);
            obj.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
