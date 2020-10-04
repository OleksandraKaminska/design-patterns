package behavioral.state;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DogTest {

    @Test
    public void whenDoActivity_thanActivitySuccessfullyDone() {
        Dog dog = new Dog();
        dog.setActivity(new Eating());

        assertEquals(dog.doActivity(), "Eat");

        dog.setActivity(new Sleeping());

        assertEquals(dog.doActivity(), "Sleep");
    }

}