package Week03.Response;

public class Modem extends NetworkDevice {
    // local attributes
    private boolean isConnected;

    public boolean checkConnection(boolean isConnected) {
        if(isConnected) {
            System.out.println("The modem is connected to the internet");
            return true;
        } else {
            System.out.println("The modem is not connected to the internet");
            return false;
        }
    }

    public Modem(String hostname, String role, String ipAddress, boolean isConnected) {
        super(hostname, role, ipAddress);
        this.isConnected = isConnected;
    }

    // get method
    public boolean getConnected() {
        return isConnected;
    }

    // set method
    public void setConnected() {
        this.isConnected = isConnected;
    }

    // override parent's
    @Override
    public String toString() {
        return "Modem [ hostname=" + getHostname() + ", role=" + getRole()
                + ", ip address=" + getIPAddress() + ", isConnected=" + isConnected +
                " ]";
    }
}
