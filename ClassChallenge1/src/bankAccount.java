public class bankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailid;
    private int phoneNumber;

    public bankAccount() {
        this(135, 666, "default name", "default emailid",
                18889);
        System.out.println("This is empty constructor");

    }

    public bankAccount(int accountNumber, double accountBalance, String customerName, String emailid, int phoneNumber) {
        System.out.println("Constructor with parameters is created");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailid = emailid;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(String customerName, String emailed, int phoneNumber) {
        this(999,7777,customerName,emailed,phoneNumber);
//        this.customerName = customerName;
//        this.emailid = emailid;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Deposit(double ammount) {
        accountBalance += ammount;
        System.out.println(" The new account balance is :" + accountBalance);
        System.out.println(toString());
        System.out.println("--------");
    }

    public void withdrawl(double ammount) {
        if (accountBalance - ammount < 0) {
            System.out.println("Account balance is low");


        } else {
            accountBalance -= ammount;
            System.out.println(" The new account balance is :" + accountBalance);
            System.out.println("--------");
        }
    }

    @Override
    public String toString() {
        return "bankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
