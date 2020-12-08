package Threads;

class NewThread4 implements Runnable {
    String threadName;
    Thread t;

    public NewThread4(String threadName) {
        this.threadName = threadName;
        t = new Thread(this, threadName);
    }

    @Override
    public void run() {
        try {
            for (int a = 5; a > 0; --a) {
                System.out.println(threadName + ": " + a);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " Interupted");
        } finally {
            System.out.println(threadName + " exiting.");
        }
    }
}

public class JoinThreads {
    public static void main(String[] args) {
        NewThread4 obj = new NewThread4("One");
        NewThread4 obj2 = new NewThread4("Two");
        NewThread4 obj3 = new NewThread4("Three");

        // Staring the threads, run() function is called
        obj.t.start();
        obj2.t.start();
        obj3.t.start();

        System.out.println("Thread One is Alive? " + obj.t.isAlive());
        System.out.println("Thread Two is Alive? " + obj2.t.isAlive());
        System.out.println("Thread Three is Alive? " + obj3.t.isAlive());

        // Wait for the threads to finish
        try {
            System.out.println("Waiting for the threads to finish");
            obj.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        } finally {
            System.out.println("Thread One is Alive? " + obj.t.isAlive());
            System.out.println("Thread Two is Alive? " + obj2.t.isAlive());
            System.out.println("Thread Three is Alive? " + obj3.t.isAlive());
            System.out.println("Main Thread exiting.");
        }
    }
}
