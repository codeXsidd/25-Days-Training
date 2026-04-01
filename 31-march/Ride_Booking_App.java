import java.util.*;
class Ride{
    String name;
    String pickup;
    String drop;
    List<String> stop;
    double fare;
    String status;

    Ride(String name,String pickup,String drop){
        this.name=name;
        this.pickup=pickup;
        this.drop=drop;
        this.stop=new ArrayList<>();          
        this.status="BOOKED";
        this.fare=calculation();
    }

    Ride(String name,String pickup,String drop,List<String> stop){
        this.name=name;
        this.pickup=pickup;
        this.drop=drop;
        this.stop=stop;
        this.status="BOOKED";
        this.fare=calculation();
    }
    double calculation(){

        
        return 50+(stop.size()*50);
    }

    void showdetails(){
        System.out.println("Customer : "+this.name+"\nRoute : ");
        System.out.print(this.pickup);
        for(String s:stop){
            System.out.print("--->"+s);
        }
        System.out.print("--->"+this.drop+"\n");
        System.out.println("Fare : "+this.fare);
        System.out.println("Status : "+this.status);
        System.out.println("----------------------");
    }

    void cancelride(){
        if(this.status.equals("Cancelled")){
            System.out.println("Already cancelled");
        }
        else if(this.status.equals("Completed")){
            System.out.println("Completed Ride Cannot be Cancelled");
        }
        else{
            this.status="Cancelled";
            this.fare=0;
            System.out.println("Ride successfully cancelled");
        }
    }

    void completeride(){
        if(this.status.equals("Cancelled")){
            System.out.println("Cancelled Ride cannot be Completed");
        }
        else if(this.status.equals("Completed")){
            System.out.println("Already Completed");
        }
        else{
            this.status="Completed";
            this.fare=0;
            System.out.println("Ride successfully Completed");
        }
    }
}

public class Main{

    public static void main(String[] args){
        Ride R1=new Ride("Ram","St.Joseph's","Guindy");
        R1.showdetails();

        List<String> stop=new ArrayList<>();
        stop.add("Camp Road");
        stop.add("Selaiyur");
        stop.add("Kamarajapuram");
        
        Ride R2=new Ride("Laskshman","Tambaram","Sembakkam",stop);
        R2.showdetails();

        R1.cancelride();
        R1.showdetails();

        R1.completeride();
        R1.showdetails();

        R2.completeride();
        R2.showdetails();

        R2.cancelride();
        R2.showdetails();

    }




}
