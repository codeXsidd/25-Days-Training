//writeString and readString - Single String

import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("test1.txt");
            
            Files.writeString(p, "bye");
            
            String s = Files.readString(p);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// write and read AllLines - List of String
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
