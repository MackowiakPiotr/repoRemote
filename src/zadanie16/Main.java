package zadanie16;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 7, 1, 2, 3, 4, 5, 11, 7, 8, 9, 20, 11, 12, 13, 14,7};
        int counter = 0;
        int tmp = 0;
        int startNumber = arrayOfNumbers[0];
        for (int i = 0; i < arrayOfNumbers.length; i++) {

            if (startNumber < arrayOfNumbers[i]) {
                startNumber = arrayOfNumbers[i];
                ++tmp;
                if (counter < tmp) {

                    counter = tmp;
                }
            } else {
                startNumber = arrayOfNumbers[i];
                tmp = 0;
            }
        }
        System.out.println("Najdłuższy podciąg liczb " + (counter + 1));
    }
}
