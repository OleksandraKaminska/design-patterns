package behavioral.visitor;

public class Dog implements Animal {

    public void getSound() {
        System.out.println("Woof woof");
    }

    public void accept(AnimalOperation animalOperation) {
        animalOperation.visitDog(this);
    }

}
