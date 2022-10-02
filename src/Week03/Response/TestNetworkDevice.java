package Week03.Response;

public class TestNetworkDevice {

    public static void main(String[] args) {

        // create instances of the router and display
        Router router = new Router("headqtr-rtr-01", "wan-router", "10.136.26.1/30", 20000);
        System.out.println(router.toString());
        // create instances of the switch and display
        Switch sw = new Switch("headqtr-sw-01", "lan-switch", "10.24.36.1/24", 50000);
        System.out.println(sw.toString());
        // create instances of the modem and display
        Modem modem = new Modem("headqtr-mdm-01", "network-modem", "10.123.26.1/16", true);
        System.out.println(modem.toString());
        modem.checkConnection(modem.getConnected());
    }

}
