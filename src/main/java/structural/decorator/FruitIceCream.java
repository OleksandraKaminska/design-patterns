package structural.decorator;

public class FruitIceCream implements IceCream {

    private SimpleIceCream simpleIceCream;

    public FruitIceCream(SimpleIceCream simpleIceCream) {
        this.simpleIceCream = simpleIceCream;
    }

    public int getCost() {
        return simpleIceCream.getCost() + 15;
    }

    public String getDescription() {
        return simpleIceCream.getDescription() + " with fruits";
    }

}
