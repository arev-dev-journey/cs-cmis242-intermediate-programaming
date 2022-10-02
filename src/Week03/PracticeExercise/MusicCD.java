package Week03.PracticeExercise;

import java.util.Calendar;

public class MusicCD extends Media {
    private int length;

    public MusicCD(int id, String title, int year, int length) {
        super(id, title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calculateRentalFee() {
        double fee = length * 0.02;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        if(this.getYear() == currYear) {
            fee += 1;
        }

        return fee;
    }

    @Override
    public String toString() {
        return "MusicCD [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear()
                + ", length=" + length + "min]";
    }
}
