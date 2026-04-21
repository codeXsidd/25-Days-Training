class Work extends Thread {
    public void run() {
        System.out.println("thread 1 is working on run 1");
    }

    public void run(int a) {
        System.out.println("thread 1 is working on run 2");
    }

    public void run(int a, int b) {
        System.out.println("run 3");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main thread work");
        Work t1 = new Work();
        
        t1.start();
        t1.run(5);
        System.out.println("main thread work");
      System.out.println("main thread work");
        System.out.println("main thread work");
        t1.run(5, 6);
        System.out.println("main thread work");
      System.out.println("main thread work");
      System.out.println("main thread work");
        }
    }
}
