package Week03.PracticeExercise;

import java.util.Calendar;

public class EBook extends Media {
    private int numChapters;

    public EBook(int id, String title, int year, int chapters) {
        super(id, title, year);
        numChapters = chapters;
    }

    public int getNumChapters() {
        return numChapters;
    }

    public void setNumChapters(int numChapters) {
        this.numChapters = numChapters;
    }

    @Override
    public double calculateRentalFee() {
        double fee = 0.1 * numChapters;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        if(this.getYear() == currYear) {
            fee += 1;
        }

        return fee;
    }

    @Override
    public String toString() {
        return "EBook [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear()
                + ", chapters=" + numChapters + "]";
    }
}
