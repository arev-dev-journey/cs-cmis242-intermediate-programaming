package Week01;

public class runAirConditioner {

    public static void main(String[] args) {
        int currentTemp = 63;
        System.out.println("Thermostat is set to " + currentTemp);

        airConditioner.setTemp(72);
        airConditioner.setTemp(88);
        airConditioner.powerOn(false);
        airConditioner.powerOn(true);
    }
}
