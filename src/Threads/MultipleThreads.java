package Threads;

class NewThread3 implements Runnable {
    String name;
    Thread t;

    public NewThread3(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        System.out.println("New Thread:  " + t);
    }

    @Override
    public void run() {
        try {
            for (int a = 5; a > 0; --a) {
                System.out.println(name + ": " + a);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interupted");
        } finally {
            System.out.println(name + " exiting.");
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        NewThread3 obj = new NewThread3("One");
        NewThread3 obj2 = new NewThread3("Two");
        NewThread3 obj3 = new NewThread3("Three");

        // Staring the threads, run() function is called
        obj.t.start();
        obj2.t.start();
        obj3.t.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        } finally {
            System.out.println("Main thread exiting.");
        }
    }
}