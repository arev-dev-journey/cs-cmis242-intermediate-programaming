package Week07.PracticeExercise;

public class IllegalPetAgeArgumentException extends IllegalArgumentException {

    private int age;

    public IllegalPetAgeArgumentException(int age) {
        super("Age must be greater than 0: age=" + age);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : Age must be greater than 0: age=" + age;
    }
}

