package Week07.Discussion;

public class Guitar {

    private String name;
    private int strings;

    public Guitar(String name, int strings) {

        if(name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalGuitarNameArgumentException(name);
        }
        if(strings <= 0) {
            throw new IllegalGuitarStringsArgumentException(strings);
        }

        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public int getStrings() {
        return strings;
    }

    // other methods here
}

