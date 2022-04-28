package main.java.ClassesInJava;

public class VolatileDataType extends Thread {
    // Use volatile here
    volatile boolean working = true;

    @Override
    public void run() {
        long count = 0;
        while (working) {
            ++count;
        }
        System.out.println("Thread terminated. " + count);
    }

    public static void main(String[] args) {
        VolatileDataType obj = new VolatileDataType();
        obj.start();
        try {
            Thread.sleep(100);
            System.out.println("After sleeping in main");
            obj.working = false;
            obj.join();
            System.out.println("Working set to, " + obj.working);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}