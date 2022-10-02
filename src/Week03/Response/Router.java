package Week03.Response;

public class Router extends NetworkDevice {

    // local attributes
    private int routeCountLimit;

    public Router(String hostname, String role, String ipAddress, int routeCountLimit) {
        super(hostname, role, ipAddress);
        this.routeCountLimit = routeCountLimit;
    }

    // get methods
    public int getRouteCountLimit() {
        return routeCountLimit;
    }

    // set methods
    public void setRouteCountLimit(int numberOfPorts) {
        this.routeCountLimit = routeCountLimit;
    }

    // override parent's
    @Override
    public String toString() {
        return "Router [ hostname=" + getHostname() + ", role=" + getRole()
                + ", ip address=" + getIPAddress() + ", routeCountLimit=" + routeCountLimit +
                " ]";
    }

}
