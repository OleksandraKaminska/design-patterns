package behavioral.visitor;

public class AnimalVisitor implements AnimalOperation {

    public void visitMonkey(Monkey monkey) {
        monkey.getSound();
    }


    public void visitDog(Dog dog) {
        dog.getSound();
    }

}
