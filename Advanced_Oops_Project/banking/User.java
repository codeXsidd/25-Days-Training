package banking;
import java.util.ArrayList;

public class User {
    public int accNo;
    public int pin;
    public double balance;
    public ArrayList<String> history = new ArrayList<>(); // use: store transactions

    public User(int accNo, int pin, double balance) {
        this.accNo = accNo;
        this.pin = pin;
        this.balance = balance;
    }
}
