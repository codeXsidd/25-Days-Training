import java.util.*;

abstract class ATM {
    abstract void withdraw(double amount); // use: withdraw money
    abstract void deposit(double amount);  // use: deposit money
    abstract void checkBalance();          // use: check balance

    void display() {
        System.out.println("Welcome to sidhhu ATM"); // use: welcome message
    }
}

interface Printer {
    void printReceipt(); // use: print transaction receipt
}

interface Security_check {
     void login(int accNo, int pin); // use: security validation
}

class User {
    int accNo;
    int pin;
    double balance;
    ArrayList<String> history = new ArrayList<>(); // use: store transactions

    User(int accNo, int pin, double balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
    }
}

class sidhATM extends ATM implements Printer, Security_check{

    private User currUser; // use: store logged-in user

    HashMap<Integer, User> users = new HashMap<>(); // use: store all users

    sidhATM() {
        users.put(101, new User(101, 2000, 1000));
        users.put(102, new User(102, 2002, 5000));
        users.put(103, new User(103, 2004, 3000));
        users.put(104, new User(104, 2006, 9000));
        users.put(105, new User(105, 1234, 15000));
    }

    public void login(int accNo, int pin) {
        if (!users.containsKey(accNo)) {
            throw new ArithmeticException("Invalid Account Number");
        }

        User user = users.get(accNo);

        if (user.pin != pin) {
            throw new ArithmeticException("Invalid PIN");
        }

        currUser = user;
        System.out.println("Login Successful");
    }

    void withdraw(double amount) {
        if (amount <= currUser.balance) {
            currUser.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            currUser.history.add("Withdraw: " + amount);
        } else {
            throw new ArithmeticException("Insufficient balance");
        }
    }

    void deposit(double amount) {
        currUser.balance += amount;
        System.out.println("Deposited: " + amount);
        currUser.history.add("Deposit: " + amount);
    }

    void checkBalance() {
        System.out.println("Balance: " + currUser.balance);
    }

    public void printReceipt() {
        System.out.println("\n----- RECEIPT -----");
        for (String h : currUser.history) {
            System.out.println(h);
        }
        System.out.println("Avail Balance: " + currUser.balance);
        System.out.println("-------------------");
    }

}

public class Main {
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
