// program -18

class Printer extends Thread {

    private String message;

    public Printer(String msg) {
        this.message = msg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MultiThreadingDemo {

    public static void main(String[] args) {
        Printer thread1 = new Printer("Thread 1 is running");
        Printer thread2 = new Printer("Thread 2 is running");
        thread1.start();
        thread2.start();
    }

}