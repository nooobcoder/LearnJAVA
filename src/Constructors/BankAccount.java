package Constructors;

/**
 * Create a new class for a bank account
 * Create fields for the account number, balance, customer name, email and phone number.
 * <p>
 * Create getters and setters for each field
 * Create two additional methods
 * 1. To allow the customer to deposit funds (this should increment the balance field).
 * 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 * but not allow the withdrawal to complete if their are insufficient funds.
 * You will want to create various code in the Main class (the one created by IntelliJ) to
 * confirm your code is working.
 * Add some System.out.println's in the two methods above as well.
 */

public class BankAccount {
    private long accountNumber, phoneNumber;
    private float balance;
    private String customerName, email;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public float getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int depositFunds(float amount) {
        // Return code is 1 if fund deposit succeeds else returns -1
        if (amount > 0) {
            balance += amount;
            return 1;
        } else return -1;
    }

    public int withDrawFunds(float amount) {
        if ((this.balance - amount) > 1) {
            this.balance -= amount;
            return 1;
        } else return -1;
    }
}
