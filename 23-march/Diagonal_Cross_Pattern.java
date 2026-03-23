// Using the Nested Loop
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {         
            for (int j = 0; j < n; j++) {      
                
                // condition for X pattern
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//-----------------------------------------------------------------------------------//

// Using the Single Loop
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n * n; i++) {
            int row = i / n;
            int col = i % n;
            if (row == col || row + col == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (col == n - 1) {
                System.out.println();
            }
        }
    }
}
