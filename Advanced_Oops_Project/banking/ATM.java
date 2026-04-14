package banking;

public abstract class ATM {
    public abstract void withdraw(double amount); // use: withdraw money
    public abstract void deposit(double amount);  // use: deposit money
    public abstract void checkBalance();          // use: check balance

    public void display() {
        System.out.println("Welcome to sidhhu ATM"); // use: welcome message
    }
}
