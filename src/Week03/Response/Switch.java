package Week03.Response;

public class Switch extends NetworkDevice {

    // local attributes
    private int macAddressCountLimit;

    public Switch(String hostname, String role, String ipAddress, int macAddressCountLimit) {
        super(hostname, role, ipAddress);
        this.macAddressCountLimit = macAddressCountLimit;
    }

    // get methods
    public int getMacAddressCountLimit() {
        return macAddressCountLimit;
    }

    // set methods
    public void setMacAddressCountLimit(int numberOfPorts) {
        this.macAddressCountLimit = macAddressCountLimit;
    }

    // override parent's
    @Override
    public String toString() {
        return "Switch [ hostname=" + getHostname() + ", role=" + getRole()
                + ", ip address=" + getIPAddress() + ", macAddressCountLimit=" + macAddressCountLimit +
                " ]";
    }
}
