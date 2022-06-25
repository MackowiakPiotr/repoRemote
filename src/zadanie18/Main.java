package zadanie18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        String text = "Ania zrobiła psikusa";
        String regexp = "(^|\\s+)a+\\s+psik(\\s+|$)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);
        boolean isMatch = matcher.find();

        if (isMatch) {
            System.out.println("Użytkownik kichnął");
        } else System.out.println("Użytkownik nie kichnął");

    }
}
