package Week03.PracticeExercise;

public abstract class Media {
    private final int id;
    private String title;
    private int year;

    public Media(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double calculateRentalFee() {
        return 3.50;
    }
}
