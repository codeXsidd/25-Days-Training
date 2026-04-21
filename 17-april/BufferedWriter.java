zimport java.io.*;

public class Main {
    public static void main(String[] args) {
        
            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hi");
            bw.newLine();
            bw.write("Hello");
            bw.close();
       
    }
}
