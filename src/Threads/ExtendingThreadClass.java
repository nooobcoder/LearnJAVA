package Threads;

class NewThread2 extends Thread {
    NewThread2() {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
        } finally {
            System.out.println("Exiting Child Thread.");
        }
    }
}

public class ExtendingThreadClass {
    public static void main(String[] args) {
        NewThread2 newThread2=new NewThread2();

    }
}
