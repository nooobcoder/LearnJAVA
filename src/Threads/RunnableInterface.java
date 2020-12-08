package Threads;

class NewThreadRunnable implements Runnable {
    Thread t;

    public NewThreadRunnable() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread:  " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        } finally {
            System.out.println("Exiting Child Thread.");
        }
    }
}


public class RunnableInterface {
    public static void main(String[] args) {
        NewThreadRunnable nt = new NewThreadRunnable();
        nt.t.start();
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("Main Thread:  " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        } finally {
            System.out.println("Main thread exiting.");
        }
    }
}
