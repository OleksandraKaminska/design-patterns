package behavioral.visitor;

public interface Animal {

    public void getSound();

    public void accept(AnimalOperation animalOperation);

}
