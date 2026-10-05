import java.util.LinkedList;

public class Accounts extends Main{
    private String CustomerName;
    private int accountNO;
    private  int AccountBalance;

    public String getCustomerName() {
        return CustomerName;
    }

    public Accounts(String customerName, int accountNO, int accountBalance) {
        CustomerName = customerName;
        this.accountNO = accountNO;
        AccountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(int accountNO) {
        this.accountNO = accountNO;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "" +
                "CustomerName='" + CustomerName + '\'' +
                ", accountNO=" + accountNO +
                ", AccountBalance=" + AccountBalance +
                "} " ;
    }




}
