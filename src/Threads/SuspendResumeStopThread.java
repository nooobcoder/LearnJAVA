package Threads;

class NewThreadSuspendable implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThreadSuspendable(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for (int u = 15; u > 0; --u) {
                System.out.println(name + " : " + u);
                Thread.sleep(200); // Sleeping the thread for 200 ms
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted.");
        }
        System.out.println(name + " exiting.");
    }

    synchronized void suspend() {
        suspendFlag = true;
    }

    synchronized void resume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResumeStopThread {
    public static void main(String[] args) {
        NewThreadSuspendable ob1 = new NewThreadSuspendable("First");
        NewThreadSuspendable ob2 = new NewThreadSuspendable("Second");

        ob1.t.start();
        ob2.t.start();

        try {
            Thread.sleep(1000);
            ob1.suspend();
            System.out.println("Suspending Thread One");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Resuming Thread One");

            ob2.suspend();
            System.out.println("Suspending Thread Two");
            Thread.sleep(1000);
            ob2.resume();
            System.out.println("Resuming Thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting.");
    }
}
