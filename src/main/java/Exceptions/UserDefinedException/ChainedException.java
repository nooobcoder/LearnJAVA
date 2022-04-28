// package main.java.Exceptions.UserDefinedException;

// class chainExcDemo {
//     void raiseError() {
//         NullPointerException e = new NullPointerException("Top Layer");
//         e.initCause(new ArithmeticException("Causing Layer").initCause(
//                 new RuntimeException("RunTimeException")
//         ));

//         // Above two lines can be re-written as
//         // throw new NullPointerException("Top Layer").initCause(new ArithmeticException("Causing Layer"));
//         throw e;
//     }
// }

// public class ChainedException {
//     public static void main(String[] args) {
//         try {
//             new chainExcDemo().raiseError();
//         } catch (NullPointerException e) {
//             System.out.println("Caught:  " + e);
//             System.out.println("Original Cause:  " + e.getCause());
//             System.out.println("More Original Cause:  " + e.getCause().getCause());
//         }
//     }
// }
