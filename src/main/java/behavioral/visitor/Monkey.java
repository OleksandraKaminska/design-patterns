package behavioral.visitor;

public class Monkey implements Animal {

    public void getSound() {
        System.out.println("Hiya");
    }

    public void accept(AnimalOperation animalOperation) {
        animalOperation.visitMonkey(this);
    }

}
