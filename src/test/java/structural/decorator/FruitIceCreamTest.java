package structural.decorator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FruitIceCreamTest {

    @Test
    public void whenGetCost_thenCostSuccessfullyCounted() {
        SimpleIceCream simpleIceCream = new SimpleIceCream();
        FruitIceCream fruitIceCream = new FruitIceCream(simpleIceCream);

        assertEquals(fruitIceCream.getCost(), 35);
    }

    @Test
    public void whenGetDescription_thenDescriptionSuccessfullyFormed() {
        SimpleIceCream simpleIceCream = new SimpleIceCream();
        FruitIceCream fruitIceCream = new FruitIceCream(simpleIceCream);

        assertEquals(fruitIceCream.getDescription(), "Ice cream with fruits");
    }

}