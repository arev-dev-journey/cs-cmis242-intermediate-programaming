package Week07.Discussion;

public class IllegalGuitarNameArgumentException extends IllegalArgumentException {

    private String msg;

    public IllegalGuitarNameArgumentException(String name) {

        if(name == null) {
            msg = "Guitar name cannot be null";
        } else if(name.isBlank()) {
            msg = "Guitar name cannot have all blank values";
        } else if(name.isEmpty()) {
            msg = "Guitar name cannot be empty value";
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + msg;
    }
}
