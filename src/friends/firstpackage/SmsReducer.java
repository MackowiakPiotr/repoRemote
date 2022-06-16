package friends.firstpackage;

import java.util.Scanner;

public class SmsReducer {
    private static String sms;

    public SmsReducer(String sms) {
        this.sms = sms;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmsReducer smsReducer = new SmsReducer(scanner.nextLine());

        // sms = "  Ala ma kota a kot ma Ale   ";

        String trim = sms.trim();
        String[] Array = trim.split(" ");

        StringBuilder smscompressed = new StringBuilder();
        for (String arr : Array) {
            if (!arr.equals("")) {
                arr = arr.substring(0, 1).toUpperCase() + arr.substring(1);
                smscompressed.append(arr);
            }
        }
        System.out.println("SMS przed kompresją miał " + sms.length() + " znaków");
        System.out.println("SMS po kompresji ma " + smscompressed.length() + " znaków");
        int costs = sms.length() / 160;
        if (costs == 0) {
            System.out.println("Koszt smsa to 25gr");
        } else if (sms.length() % 160 == 0) {
            int counter = 0;
            for (int i = 0; i < costs; i++) {
                counter++;
            }
            System.out.println("Koszt smsa to " + (0.25 * (float) counter) + " zł");
        } else if (sms.length() % 160 != 0 && costs >= 1) {
            int counter = 0;
            for (int i = 0; i <= costs; i++) {
                counter++;

            }
            System.out.println("Koszt smsa to " + (0.25 * (float) counter) + " zł");
        }

        System.out.println(smscompressed);
        System.out.println(trim);
    }

}



