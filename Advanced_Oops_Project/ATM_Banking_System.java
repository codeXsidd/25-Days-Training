import java.util.Scanner;
import java.util.InputMismatchException;
import banking.sidhATM;

public class ATM_Banking_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sidhATM atm = new sidhATM();

        atm.display();

        int attempts = 3; // use: limit login attempts

        while (attempts > 0) {
            try {
                System.out.print("Enter Account Number: ");
                int acc = sc.nextInt();

                System.out.print("Enter PIN: ");
                int pin = sc.nextInt();

                atm.login(acc, pin);
                break;

            } catch (Exception e) {
                attempts--;
                System.out.println(e.getMessage());
                System.out.println("Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Account blocked ❌");
            return;
        }

        while (true) {
            System.out.println(
                        "1.Deposit\n" +
                        "2.Withdraw\n" +
                        "3.Check Balance\n" +
                        "4.Print Receipt\n" +
                        "5.Exit"
                    );

            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        atm.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        try {
                            atm.withdraw(sc.nextDouble());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        atm.checkBalance();
                        break;

                    case 4:
                        atm.printReceipt();
                        break;

                    case 5:
                        System.out.println("\nThank you for using Sidhhu ATM 🙏");
                        System.out.println("Visit again!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter valid number!!");
                sc.next();
            }
        }
    }
}
