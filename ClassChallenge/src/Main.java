public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
//        BankAccount bankAccount=new BankAccount(1000,900,"DEB","DEB@",9501216);

//        int accountNumber,double accountBalance,String customerName,String email,int phoneNumber
//        bankAccount.describeBankAccont();
//        bankAccount.withdrawl(1000);
//        bankAccount.deposite(900);
//        bankAccount.describeBankAccont();
//        bankAccount.setAccountNumber(13566);
        bankAccount.setCustomerName("Debjyoti");
        System.out.println(bankAccount.getCustomerName()+"");

    }

}
