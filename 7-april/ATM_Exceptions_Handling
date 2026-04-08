class InvalidPinException extends Exception{
    InvalidPinException(String str){
        super(str);
    }
}

class InsufficientBalance extends Exception{
    InsufficientBalance(String str){
        super(str);
    }
}


class Atm{
    private int pin=1234;
    private int balance=5000;
    public void pinvalidate(int p) throws InvalidPinException{
        if(p!=pin){
            throw new InvalidPinException("InvalidPinException");
        }
        System.out.println("Valid Pin");
    }
    public void checkbalance(){
        System.out.println("Available Balance:"+balance);
    }
    public void deposit(int a){
        balance=balance+a;
        System.out.println("Amount Deposited");
    }
    public void withdraw(int a) throws InsufficientBalance{
        if(balance<a){
            throw new InsufficientBalance("InsufficientBalance");
        }
        balance=balance-a;
        System.out.println("Withdrawal Successful");
    }
}

public class Main{
    public static void main(String[] args){
        Atm a1=new Atm();
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter your Pin:");
            int p1=sc.nextInt();
            a1.pinvalidate(p1);
            System.out.println("Enter your Choice:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    a1.checkbalance();
                    break;
                case 2:
                    System.out.println("Enter a amount:");
                    int am=sc.nextInt();
                    a1.deposit(am);
                    break;
                case 3:
                    System.out.println("Enter the Withdrawal Amount:");
                    int am=sc.nextInt();
                    a1.withdraw(am);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        catch(InvalidPinException e){
              System.out.println(e.getMessage());          
        }
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Thank you!! Visit Again!!");
        }
    }
}
