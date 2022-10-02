package Week03.Response;

public class NetworkDevice {
    private String hostname;
    private String role;
    private String ipAddress;

    // constructor
    public NetworkDevice(String hostname, String role, String ipAddress) {
        this.hostname = hostname;
        this.role = role;
        this.ipAddress = ipAddress;
    }

    // get methods
    public String getHostname() {
        return hostname;
    }

    public String getRole() {
        return role;
    }

    public String getIPAddress() {
        return ipAddress;
    }

    // set methods
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setRole(String role) {
        this.ipAddress = ipAddress;
    }

    public void setIPAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
