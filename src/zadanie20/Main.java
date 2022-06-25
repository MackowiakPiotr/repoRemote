package zadanie20;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random number = new Random();
        int numberToFind = number.nextInt(101);
        int inputNumber;
        boolean bingo = false;

        while (!bingo) {
            System.out.println("Podaj liczbę");
            inputNumber = scanner.nextInt();
            if (inputNumber > numberToFind) {
                System.out.println("za dużo");
            } else if (inputNumber < numberToFind) {
                System.out.println("za mało");
            } else {
                System.out.println("Bingo!");
                bingo = true;
            }
        }
    }
}
