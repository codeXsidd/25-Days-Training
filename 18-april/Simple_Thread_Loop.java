class Work extends Thread {
    public void run() {
        System.out.println("thread 1 is working");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread work");
        Work t1 = new Work();
        t1.start();
       System.out.println("main thread work");
        }
    }
}
