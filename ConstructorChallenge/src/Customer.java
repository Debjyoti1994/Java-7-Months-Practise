public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("nobody","nobody@nowhere.com");
//        System.out.println("this is empty constructor");
    }

    public Customer(String name, String emailAddress) {
        this(name,1900,emailAddress);

    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
//        System.out.println("Customer name is:"+getName()
//                           +" Customer Credit limit is:"+getCreditLimit()
//                            +" Customer Email Address is:"+getEmailAddress());
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
