package Constructors2;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    Account() {
        // Setting default values for the parameterized constructor
        this("number", 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Default Constructor Called");
    }

    // Like normal functions, constructors can be overloaded too
    Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Parameterized Constructor");
        this.number = number;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("999999", 100.55, customerName, customerEmail, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " mande. New balance is, " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("Only, " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining Balance:  " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
