class Task implements Runnable{
    public void run(){
        System.out.println("thread 2is running");
    }
}
class Work extends Pending implements Runnable{
   
    public void run(){
        System.out.println("thread 1 is running");
    }
}
public class Main
{
public static void main(String[] args) {
System.out.println("main thread is doing");
Work w=new Work();
Thread t1=new Thread(w);
Thread t2=new Thread(new Task());
t1.start();
t2.start();
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");
System.out.println("main thread is doing");

}
}
