public class Account {

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int accountId;
    private String customerName;
    private int balance;
    public Account(int accountId,String customerName,int balance){
        this.accountId=accountId;
        this.customerName=customerName;
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            this.balance+=amount;
        }
    }
    public void withdraw(int amount) throws InsufficientFundsExceptions {
        if(amount>this.balance){
            throw new InsufficientFundsExceptions("Low on funds");
        }
        if(amount>0){
            this.balance-=amount;
        }
    }

}
