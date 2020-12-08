package Threads;

class ThreadedClass implements Runnable {
    String name;
    Thread t;
    Thread.State ts;

    public ThreadedClass(String name) {
        this.name = name;
        t = new Thread(this, this.name);
        ts = t.getState();
        System.out.println(name + " status:  " + ts);
    }

    public void ThreadStatus() {
        while (ts == Thread.State.RUNNABLE) {
            System.out.println(name + " status:  " + ts);
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted!");
        }
    }
}

public class ThreadStates {
    public static void main(String[] args) {
        ThreadedClass obj = new ThreadedClass("First");
        obj.t.start();
        obj.ThreadStatus();
    }
}
