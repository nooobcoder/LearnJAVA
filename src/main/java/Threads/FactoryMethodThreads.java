package main.java.Threads;

class NewThreadF implements Runnable {
    Thread thread = new Thread("FactoryThread");

    public static NewThreadF createAndStart() {
        System.out.println("Inside factory method!");
        NewThreadF newThreadF = new NewThreadF();
        newThreadF.thread.start();
        return newThreadF;
    }

    @Override
    public void run() {
        System.out.println("Inside run function.");
    }
}

public class FactoryMethodThreads {
    public static void main(String[] args) {
        NewThreadF returnedThreadObj = NewThreadF.createAndStart();

    }
}
