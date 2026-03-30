public class Main {
    public static void main(String[] args) {
//        bankAccount suman=new bankAccount(1234,500,"suman","suman@gmail.com",
//                55708);
        bankAccount suman=new bankAccount();
////        suman.setCustomerName("Suman");
//        suman.setAccountBalance(10_000);
//        suman.setAccountNumber(1223433);
//        suman.setEmailid("suma@gmail.com");
//        suman.setPhoneNumber(67787757);
        suman.Deposit(100);
        suman.setAccountBalance(50);
        suman.withdrawl(100);
        bankAccount timsAccount=new bankAccount("tim","tim@hjhj",9000);
        System.out.println("name :- "+timsAccount.getCustomerName()+" ; account number:-"+timsAccount.getAccountNumber());
    }
}
