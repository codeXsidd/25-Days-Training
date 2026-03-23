// Using the nested loop

public class Main {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {       
            for (int j = 0; j < n; j++) {  
              // print * for borders
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
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

// Using the Single loop

public class Main {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n * n; i++) {
            int row = i / n;
            int col = i % n;
            // check border condition
            if (row == 0 || row == n - 1 || col == 0 || col == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // move to next line after each row
            if (col == n - 1) {
                System.out.println();
            }
        }
    }
}
