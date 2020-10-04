package structural.adapter;

public class SocketAdapter implements EuropeanSocket {

    private AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    public String getPower() {
        return americanSocket.getPower();
    }

}
