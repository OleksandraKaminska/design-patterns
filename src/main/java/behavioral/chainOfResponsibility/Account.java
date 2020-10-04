package behavioral.chainOfResponsibility;

public abstract class Account {

    private Account account;

    public Account(Account account){
        this.account = account;
    }

}
