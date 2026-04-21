//Read Single Character

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            int ch = br.read();
            System.out.println((char) ch);
        } catch (IOException e) {
            e.printStackTrace();//
        }
    }
}

//Read Single Line

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
          // Code snippet from diagram
              int ch = br.read();
              System.out.println((char) ch);

// Overridden by:
String s = br.readLine();
System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//Read All Lines

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
