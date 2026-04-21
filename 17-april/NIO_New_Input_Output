import java.io.File;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("test1.txt");
            Files.writeString(p,"bye");
String s=Files.readString(p);
System.out.print(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
