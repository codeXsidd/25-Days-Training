import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "Hi Hello Good";

        for (int i = 0; i < str.length(); i++) {

            boolean flag = false;

            // Check if character already counted
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                continue;

            int count = 1;

            // Count occurrences
            for (int k = i + 1; k < str.length(); k++) {
                if (str.charAt(k) == str.charAt(i)) {
                    count++;
                }
            }

            // Print result
            if (str.charAt(i) == ' ') {
                System.out.println("space : " + count);
            } else {
                System.out.println(str.charAt(i) + " : " + count);
            }
        }
    }
}
