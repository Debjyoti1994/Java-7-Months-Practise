@SuppressWarnings("SpellCheckingInspection")
public class Customer {
    private String name;
    private double creditLimit;
    private String emailid;

    public Customer(String name, double creditLimit, String emailid) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailid = emailid;
    }
    public Customer(){
        this("rakesh","rakesh@gmai.com");

    }

    public Customer(String name,String emailid) {
        this(name,1000,emailid);
//        this.emailid = emailid;
//        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailid() {
        return emailid;
    }
}
