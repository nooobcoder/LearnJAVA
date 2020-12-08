package Threads;

class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered Threads.A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Threads.A Interrupted");
        }
        System.out.println(name + " trying to call Threads.B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside Threads.A.last()");
    }
}

class B {

    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered Threads.B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Threads.B Interrupted");
        }
        System.out.println(name + " trying to call Threads.A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Inside Threads.B.last()");
    }
}

public class Deadlock {
    A a = new A();
    B b = new B();
    Thread t;

    public Deadlock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread((Runnable) this, "RacingThread");
    }

    void deadLockStart() {
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a);
        System.out.println("Back in other thread.");
    }

    public static void main(String[] args) {
        Deadlock d1 = new Deadlock();
        d1.deadLockStart();
    }
}
