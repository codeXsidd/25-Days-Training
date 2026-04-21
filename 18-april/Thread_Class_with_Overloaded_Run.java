class Task extends Thread {
    public void run() {
        System.out.println("run 1");
    }

    public void run(int a) {
        System.out.println("run 2");
    }
}

class Main {
    public static void main(String[] args) {
        Task t = new Task();
        t.start(); // Calls run()
        t.run(5);  // Calls overloaded run(int a) manually
    }
}
