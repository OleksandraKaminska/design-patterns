package structural.adapter;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SocketAdapterTest {

    @Test
    public void whenConvertingToEuropeanSocket_thenSuccessfullyConverted() {
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        EuropeanSocket europeanSocket = new SocketAdapter(americanSocket);

        assertEquals(europeanSocket.getPower(), "220 Volt");
    }

}
