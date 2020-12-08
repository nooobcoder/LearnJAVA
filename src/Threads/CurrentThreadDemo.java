package Threads;

class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("My Thread");
        System.out.println("After Name Change: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ioe) {
            System.out.println("EXCEPTION HANDLED");
        }
    }
}