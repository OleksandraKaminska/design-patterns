package structural.adapter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IronTest {

    @Test
    public void whenTurnOn_thenIronWorks() {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        EuropeanSocket europeanSocket = new SocketAdapter(americanSocket);

        Iron iron = new Iron();
        assertEquals(iron.turnOn(europeanSocket), "Iron turned on");
    }

}
