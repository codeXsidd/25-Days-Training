import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("image1.jpg");
            FileOutputStream fo = new FileOutputStream("stored.jpg");
            byte[] buffer = new byte[8192];
            int b;
            while ((b = fi.read(buffer)) != -1) {
                fo.write(buffer, 0, b);
            }
            fi.close();
            fo.close();
            System.out.println("Image has stored successfully");

            // Displaying the image
            JFrame j = new JFrame("show image");
            j.setSize(500, 500);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon i = new ImageIcon("stored.jpg");
            JLabel jl = new JLabel(i);
            j.add(jl);
            j.setVisible(true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
