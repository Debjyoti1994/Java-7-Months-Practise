public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this(2356,2067.0,"Deb","default@gmai.com",0255645);
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accountNumber,double accountBalance,String customerName,String email,int phoneNumber){
        System.out.println(" Account no with parameters called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;


    }

    public BankAccount(int phoneNumber, String email, String customerName) {
        this(999,101.4,customerName,email,phoneNumber);
    }

    public void setAccountNumber(int accountNumber){
    this.accountNumber=accountNumber;

}public int getAccountNumber(){
    return accountNumber;
    }

    public double getAccountBalance() {

        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void describeBankAccont(){
        System.out.println("Customer name :"+customerName);
        System.out.println("Account-Number :"+accountNumber);
        System.out.println("Account balance :"+accountBalance);
        System.out.println("Email:"+email);
        System.out.println("PhoneNumber:"+phoneNumber);

    }
    public void withdrawl(int ammount){
    if ((this.accountBalance-ammount)<0) System.out.println("Not alowed");
        else{System.out.println(ammount+" is withdrawn. ");
            this.accountBalance-=ammount;
            }}
    public void deposite(int amount){
    this.accountBalance+=amount;
        System.out.println(amount+" is deposited");
    }

}
