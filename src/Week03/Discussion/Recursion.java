package Week03.Discussion;

public class Recursion {

    public static String toBinary(int n) {
        if(n < 1) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + n % 2;
    } // end toBinary

    public static void main(String[] args) {
        System.out.println(toBinary(1024));
        System.out.println(toBinary(10));
        System.out.println(toBinary(4));

    } // end main
} // end class