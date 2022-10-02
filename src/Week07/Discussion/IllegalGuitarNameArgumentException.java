package Week07.Discussion;

public class IllegalGuitarNameArgumentException extends IllegalArgumentException {
    private String msg;

    public IllegalGuitarNameArgumentException(String name) {
        msg = "Guitar name cannot be null";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + msg;
    }
}
