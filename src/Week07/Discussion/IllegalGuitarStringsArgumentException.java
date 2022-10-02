package Week07.Discussion;

public class IllegalGuitarStringsArgumentException extends IllegalArgumentException {

    private int strings;

    public IllegalGuitarStringsArgumentException(int strings) {
        super("Your guitar must have at least 6 strings: strings=" + strings);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : Your guitar must have at least 6 strings: strings=" + strings;
    }
}
