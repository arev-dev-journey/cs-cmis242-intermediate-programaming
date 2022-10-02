package Week07.PracticeExercise;

public class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {

        if(name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalPetNameArgumentException(name);
        }
        if(age <= 0) {
            throw new IllegalPetAgeArgumentException(age);
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // other methods here
}

