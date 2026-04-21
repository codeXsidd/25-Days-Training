import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> str = Arrays.asList("hi", "hello", "great");
            Path p = Paths.get("test1.txt");
            
            Files.write(p, str);
            
            List<String> s = Files.readAllLines(p);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
