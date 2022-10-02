package Week03.PracticeExercise;

public class RunRental {

    public static void main(String[] args) {
        EBook eBook = new EBook(123, "Forever Young", 2018, 20);
        System.out.print(eBook);
        System.out.printf("    Rental fee=$%.2f\n", eBook.calculateRentalFee());

        MusicCD cd = new MusicCD(124, "Beyond Today", 2022, 114);
        System.out.print(cd);
        System.out.printf("    Rental fee=$%.2f\n", cd.calculateRentalFee());

        MovieDVD dvd = new MovieDVD(123, "After Tomorrow", 2020, 120);
        System.out.print(dvd);
        System.out.printf("    Rental fee=$%.2f\n", dvd.calculateRentalFee());

        eBook.setNumChapters(25);
        System.out.print("\nChanging EBook chapters to 25:    ");
        System.out.println(eBook);
        System.out.printf("    New Rental fee=$%.2f\n", eBook.calculateRentalFee());

        cd.setLength(120);
        System.out.print("\nChanging MusicCd length to 120:    ");
        System.out.println(cd);
        System.out.printf("    New Rental fee=$%.2f\n", cd.calculateRentalFee());
    }
}
