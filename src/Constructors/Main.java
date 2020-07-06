package Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number:  ");
        long accountNumber = scanner.nextLong();

        System.out.print("Enter Phone Number:  ");
        long phoneNumber = scanner.nextLong();

        System.out.print("Enter Account Balance:  ");
        float balance = scanner.nextFloat();

        System.out.print("Enter Customer Name:  ");
        String customerName = scanner.nextLine();

        System.out.print("Enter E-Mail:  ");
        String userEmail = scanner.nextLine();


        BankAccount user1 = new BankAccount();
        {
            user1.setAccountNumber(accountNumber);
            user1.setBalance(balance);
            user1.setCustomerName(customerName);
            user1.setEmail(userEmail);
            user1.setPhoneNumber(phoneNumber);
        }

        System.out.print("1. Deposit Funds\n2. Withdraw Funds\n3. Display Account Details\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter Fund Amount to be Deposited:  ");
                float fund = scanner.nextFloat();

                if (user1.depositFunds(fund) == -1)
                    System.out.println("Fund Deposition could not succeed!");
                else System.out.println("Fund Deposited Successfully");
            }

            case 2 -> {
                System.out.print("Enter Fund Amount to be Withdrawn:  ");
                float fund = scanner.nextFloat();

                if (user1.withDrawFunds(fund) == -1)
                    System.out.println("Fund Withdrawal could not succeed!");
                else System.out.println("Fund Withdrawn successfully");

                System.out.println("Updated Account Balance: " + user1.getBalance());
            }

            case 3 -> {
                System.out.println("EMAIL: " + user1.getEmail());
                System.out.println("CUSTOMER NAME: " + user1.getCustomerName());
                System.out.println("ACCOUNT NUMBER: " + user1.getAccountNumber());
                System.out.println("PHONE NUMBER: " + user1.getPhoneNumber());
                System.out.println("============================================\nBALANCE: " + user1.getBalance());
            }
            
            default -> System.out.println("Invalid Option Chosen");
        }
    }
}
