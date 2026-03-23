// Using the Nested Loop
public class Main {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 0; i < n; i++) {      
            for (int j = 0; j < n; j++) {   
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}

//-----------------------------------------------------------------------------------//

// Using the Single Loop
public class Main {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n * n; i++) {
            System.out.print("*");

            // move to next line after every n elements
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
    }
}
