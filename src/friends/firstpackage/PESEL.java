package friends.firstpackage;

public class PESEL {
    private final long peselInput;

    public PESEL(long peselInput) {
        this.peselInput = peselInput;
    }

    public int[] peselToArrayInt() {

        String peselString = String.valueOf(peselInput);
        char[] arrpesel = peselString.toCharArray();
        int[] arrPeselInt = new int[11];
        for (int i = 0; i < arrpesel.length; i++) {
            arrPeselInt[i] = Integer.parseInt(String.valueOf(arrpesel[i]));
        }
        return arrPeselInt;
    }

    public void peselCheck(int[] arrPeselInt) {
        int result = arrPeselInt[0] + arrPeselInt[1] * 3 + arrPeselInt[2] * 7 + arrPeselInt[3] * 9
                + arrPeselInt[4] + arrPeselInt[5] * 3 + arrPeselInt[6] * 7 + arrPeselInt[7] * 9
                + arrPeselInt[8] + arrPeselInt[9] * 3 + arrPeselInt[10];

        if (result % 10 == 0) {
            System.out.println("Pesel jest poprawny");
        } else System.out.println("Pesel niepoprawny");

    }
}
