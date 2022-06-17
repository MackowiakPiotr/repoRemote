package friends.firstpackage;

import java.util.Arrays;

public class IntArray {
    private int[] arrayInitialized;

    public IntArray() {
        this.arrayInitialized = new int[5];

    }

    public void add(Integer value) {
        for (int i = 0; i < arrayInitialized.length; i++) {
            if (arrayInitialized[i] == 0) {
                arrayInitialized[i] = value;
                break;
            }
            if (arrayInitialized[arrayInitialized.length - 1] != 0) {
                System.out.println("tablica pełna, tworzę nową tablicę, większą o 5 elementów");
                arrayInitialized = Arrays.copyOf(arrayInitialized, (arrayInitialized.length + 5));
                if (arrayInitialized[i] == 0) {
                    arrayInitialized[i] = value;
                    break;
                }
            }
        }
    }

    public void add(Integer value, int idx) {
        if (idx > arrayInitialized.length - 1) {
            System.out.println("Wskaźnik jest poza tablicą");
        } else arrayInitialized[idx] = value;
    }

    public Integer get(int idx) {

        if (idx >= 0 && idx < arrayInitialized.length && arrayInitialized[idx] != 0) {
            return arrayInitialized[idx];
        } else
            return null;
    }

    public void remove(int idx) {
        arrayInitialized[idx] = 0;
    }

    public void swap(int from, int to) {

        if (to > arrayInitialized.length - 1) {
            arrayInitialized = Arrays.copyOf(arrayInitialized, to + 1);
        }
        int tmp = arrayInitialized[from];
        arrayInitialized[from] = arrayInitialized[to];
        arrayInitialized[to] = tmp;
    }

    public String toString() {
        for (int j : arrayInitialized) {
            System.out.print("[ " + j + " ]");
        }
        return "";
    }

}
