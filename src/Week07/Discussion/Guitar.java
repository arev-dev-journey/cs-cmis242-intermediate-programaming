package Week07.Discussion;

public class Guitar extends Instrument {
    public Guitar() {
        super();
    }

    public Guitar(String name, int numStrings) {
        super(name, numStrings);
        if(name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalGuitarNameArgumentException(name);
        }
        if(numStrings < 6) {
            throw new IllegalGuitarStringsArgumentException(numStrings);
        }
    }
}

