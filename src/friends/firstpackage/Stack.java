package friends.firstpackage;

public class Stack {
    int[] arrStack;

    public Stack(int count) {
        this.arrStack = new int[count];
    }

    public void push(Integer e) {
        for (int i = 0; i < arrStack.length; i++) {

            if (arrStack[i] == 0) {
                arrStack[i] = e;
                break;
            }
        }
        if (arrStack[arrStack.length - 1] != 0) {
            System.out.println("Stos jest pełny");
        }
    }

    public Integer pop() {
        for (int i = arrStack.length - 1; i >= 0; i--) {
            if (arrStack[i] != 0) {
                arrStack[i] = 0;
                break;
            }
        }
        if (arrStack[0] == 0) System.out.println("Stos jest pusty");
        return null;
    }


    public boolean isEmpty() {

        return arrStack[0] == 0;
    }

    public boolean isFull() {

        return arrStack[arrStack.length - 1] != 0;
    }

    public void displayStack() {
        for (int element : arrStack) {
            System.out.print(" " + element + ", ");
        }
        System.out.println();
    }
    public String toString(){
        for (int i =0; i<arrStack.length;i++){
           System.out.print("[ "+arrStack[i]+" ]");
        }
        System.out.println();
        return "Done!";
    }


}
