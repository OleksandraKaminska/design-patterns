package behavioral.command;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class CynologistTest {

    @Test
    public void whenTrainDog_thanAllCommandsExecuted() {
        Dog dog = new Dog("Barsik");
        Command sitDownCommand = new SitDownCommad(dog);
        Command standUpCommand = new StandUpCommand(dog);

        Cynologist cynologist = new Cynologist();
        cynologist.setCommands(List.of(sitDownCommand, standUpCommand));

        List<String> expectedCommands = Arrays.asList("Barsik is sitting...", "Barsik is standing...");

        Assert.assertEquals(expectedCommands, cynologist.trainDog());
    }

}