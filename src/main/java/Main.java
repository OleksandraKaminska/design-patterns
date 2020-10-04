import behavioral.chain.BankAccount;
import behavioral.chain.BitcoinAccount;
import behavioral.chain.PaypalAccount;
import behavioral.visitor.AnimalVisitor;
import behavioral.visitor.Dog;
import behavioral.visitor.Monkey;
import structural.composite.FinancialDepartment;
import structural.composite.HeadDepartment;
import structural.composite.SalesDepartment;

public class Main {

    public static void main(String[] args) {
        // Composite pattern
        SalesDepartment salesDepartment = new SalesDepartment();
        FinancialDepartment financialDepartment = new FinancialDepartment();
        HeadDepartment headDepartment = new HeadDepartment();

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.printDepartmentName();

        // Visitor
        AnimalVisitor animalVisitor = new AnimalVisitor();
        Monkey monkey = new Monkey();
        Dog dog = new Dog();

        monkey.accept(animalVisitor);
        dog.accept(animalVisitor);

        // Chain of responsibility
        BankAccount bankAccount = new BankAccount(100);
        PaypalAccount paypalAccount = new PaypalAccount(150);
        BitcoinAccount bitcoinAccount = new BitcoinAccount(1);

        bankAccount.setNextAccount(paypalAccount);
        paypalAccount.setNextAccount(bitcoinAccount);

        bankAccount.pay(100);
    }

}
