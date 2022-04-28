package main.java.Threads;

// Create a second thread
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread:  " + t);
    }

    // This is the entry point for the second thread
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("Child Thread:  " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting Child Thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start(); // Start the thread

        try {
            for (int a = 5; a > 0; --a) {
                System.out.println("Main Thread: " + a);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exiting Main Thread");
    }
}
