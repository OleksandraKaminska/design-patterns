package behavioral.chain;

public abstract class Account {

    private int balance;
    private Account nextAccount;

    public Account(int balance) {
        this.balance = balance;
    }

    public void setNextAccount(Account nextAccount) {
        this.nextAccount = nextAccount;
    }

    public void pay(int amountToPay){
        if(balance >= amountToPay) {
            writeMessage();
        } else if (nextAccount != null) {
            nextAccount.pay(amountToPay);
        }
    }

    public abstract void writeMessage();

}
