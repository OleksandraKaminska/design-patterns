package behavioral.chain;

public class BankAccount extends Account {

    public BankAccount(int balance) {
        super(balance);
    }

    @Override
    public void writeMessage() {
        System.out.println("Payment by bank");
    }

}
