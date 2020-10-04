package behavioral.chain;

public class PaypalAccount extends Account {


    public PaypalAccount(int balance) {
        super(balance);
    }

    @Override
    public void writeMessage() {
        System.out.println("Payment by paypall");
    }

}
