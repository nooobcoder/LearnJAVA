package main.java.Constructors2;

public class Main {
    public static void main(String[] args) {
        // We actually dont need setter methods we can use a parameterized constructor
        Account bobsAccount = new Account("123456", 0.0, "Bob Brown", "bobbuilder@example.com", "035139653");

        /*// Setting the default field values
        bobsAccount.setNumber("123456");
        bobsAccount.setBalance(0.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("bobbuilder@example.com");
        bobsAccount.setCustomerPhoneNumber("035139653");*/

        System.out.println("CALLING GETTER FUNCTIONS\n");
        System.out.println("Balance: " + bobsAccount.getBalance());
        System.out.println("E-Mail: " + bobsAccount.getCustomerEmail());
        System.out.println("Name: " + bobsAccount.getCustomerName());
        System.out.println("Phone Number: " + bobsAccount.getCustomerPhoneNumber());
        System.out.println("Number: " + bobsAccount.getNumber());
        System.out.println();

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

        /** Creating another object of the class and calling the default constructor. By doing so
         default values would be assigned to the member variables
         */

        Account defaultAccount = new Account();
        System.out.println("\n\nCalling a default version of the class");
        System.out.println("CALLING GETTER FUNCTIONS\n");
        System.out.println("Balance: " + defaultAccount.getBalance());
        System.out.println("E-Mail: " + defaultAccount.getCustomerEmail());
        System.out.println("Name: " + defaultAccount.getCustomerName());
        System.out.println("Phone Number: " + defaultAccount.getCustomerPhoneNumber());
        System.out.println("Number: " + defaultAccount.getNumber());
        System.out.println("Balance: " + defaultAccount.getBalance());
        System.out.println();

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("CALLING GETTER FUNCTIONS\n");
        System.out.println("Balance: " + timsAccount.getBalance());
        System.out.println("E-Mail: " + timsAccount.getCustomerEmail());
        System.out.println("Name: " + timsAccount.getCustomerName());
        System.out.println("Phone Number: " + timsAccount.getCustomerPhoneNumber());
        System.out.println("Number: " + timsAccount.getNumber());
        System.out.println("Balance: " + timsAccount.getBalance());
        System.out.println();
    }
}
