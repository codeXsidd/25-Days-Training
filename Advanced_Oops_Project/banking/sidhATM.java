package banking;

import java.util.HashMap;

public class sidhATM extends ATM implements Printer, Security_check {

    private User currUser; // use: store logged-in user

    public HashMap<Integer, User> users = new HashMap<>(); // use: store all users

    public sidhATM() {
        users.put(101, new User(101, 2000, 1000));
        users.put(102, new User(102, 2002, 5000));
        users.put(103, new User(103, 2004, 3000));
        users.put(104, new User(104, 2006, 9000));
        users.put(105, new User(105, 1234, 15000));
    }

    @Override
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

    @Override
    public void withdraw(double amount) {
        if (amount <= currUser.balance) {
            currUser.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            currUser.history.add("Withdraw: " + amount);
        } else {
            throw new ArithmeticException("Insufficient balance");
        }
    }

    @Override
    public void deposit(double amount) {
        currUser.balance += amount;
        System.out.println("Deposited: " + amount);
        currUser.history.add("Deposit: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance: " + currUser.balance);
    }

    @Override
    public void printReceipt() {
        System.out.println("\n----- RECEIPT -----");
        for (String h : currUser.history) {
            System.out.println(h);
        }
        System.out.println("Avail Balance: " + currUser.balance);
        System.out.println("-------------------");
    }
}
