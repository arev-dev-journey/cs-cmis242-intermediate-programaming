package Week03.PracticeExercise;

public class MovieDVD extends Media {
    private double size;

    public MovieDVD(int id, String title, int year, double size) {
        super(id, title, year);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MovieDVD [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear()
                + ", size=" + size + "MB]";
    }
}
