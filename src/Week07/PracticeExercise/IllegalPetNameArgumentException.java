package Week07.PracticeExercise;

public class IllegalPetNameArgumentException extends IllegalArgumentException {

    private String msg;

    public IllegalPetNameArgumentException(String name) {

        if(name == null) {
            msg = "Pet name cannot be null";
        } else if(name.isBlank()) {
            msg = "Pet name cannot have all blank values";
        } else if(name.isEmpty()) {
            msg = "Pet name cannot be empty value";
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : " + msg;
    }
}
