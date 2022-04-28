package main.java.LambdaExpressions.MethodReferences.TestCodeForMethodReference;

class MethodReferencesExample1 {
    public static void printMessage() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        /* Thread t = new Thread(() -> {
            // Inside a lambda
            printMessage();
        }); */
        // t.start();

        Thread t = new Thread(MethodReferencesExample1::printMessage);
        t.start();
    }
}