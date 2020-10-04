package behavioral.chain;

public class BitcoinAccount extends Account {


    public BitcoinAccount(int balance) {
        super(balance);
    }

    @Override
    public void writeMessage() {
        System.out.println("Payment by paypall");
    }

}
