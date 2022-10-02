package Week07.Discussion;

public class IllegalGuitarStringsArgumentException extends IllegalArgumentException {

    private int strings;

    public IllegalGuitarStringsArgumentException(int strings) {
        super("Guitar strings must be greater than 0: strings=" + strings);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : Strings must be greater than 0: strings=" + strings;
    }
}
