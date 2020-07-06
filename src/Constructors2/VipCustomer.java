package Constructors2;

/* Create a new class VipCustomer
 it should have 3 fields name, credit limit, and email address.
 create 3 constructors
 1st constructor empty should call the constructor with 3 parameters with default values
 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
 3rd constructor should save all fields.
 create getters only for this using code generation of intellij as setters wont be needed
 test and confirm it works.*/

public class VipCustomer {
    private String name, emailAddress;
    private float creditLimit;

    VipCustomer() {
        this("Example Name", 500, "example@example.com");
    }

    VipCustomer(String name, float creditLimit) {
        this(name, creditLimit, "abc@example.com");
    }

    VipCustomer(String name, float creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());

        VipCustomer vipCustomer1 = new VipCustomer("Bob", 25000.0f);
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Tim", 100.0f, "tim@mail.com");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
    }
}
