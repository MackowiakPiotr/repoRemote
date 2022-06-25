package zadanie17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String stringDate = "20220917";

        LocalDate localDateFromString = (LocalDate.parse(stringDate, DateTimeFormatter.BASIC_ISO_DATE));

        Period daysToDeadline = Period.between(LocalDate.now(), localDateFromString);
        System.out.println("Pozostało do zajęć: " + (daysToDeadline.getDays()) + " dni");
        System.out.println(Period.between(LocalDate.now(), localDateFromString));
    }
}
