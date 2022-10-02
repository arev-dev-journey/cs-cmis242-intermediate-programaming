package Week01;

public class airConditioner {
    public String name;
    public String color;

    boolean isTurnedOn = false;

    public static void setTemp(int num) {
        if(num >= 63 && num <= 83) {
            System.out.println("The temperature is set to " + num);
        } else {
            System.out.println("Number is out of range");
        }
    }

    public static void powerOn(boolean isTurnedOn) {
        if(isTurnedOn) {
            System.out.println("The unit is on");
        } else {
            System.out.println("The unit is off");
        }
    }
}
