package Threads;

class Callme {
    void call(String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        } finally {
            System.out.println(" ]");
        }
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
    }

    @Override
    public void run() {
        // We can put the statements inside a synchronized block instead of making a function as synchronized
        /*synchronized (target) {
            target.call(msg);
        }*/
        target.call(msg);
    }
}

public class ThreadsSynchronize {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller("Hello", target);
        Caller ob2 = new Caller("Synchronized", target);
        Caller ob3 = new Caller("World", target);

        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted!");
        } finally {
            System.out.println("Main Thread Exiting.");
        }
    }
}
