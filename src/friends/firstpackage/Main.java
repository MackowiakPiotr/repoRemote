package friends.firstpackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.push(8);
        stack.push(6);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(4);
        stack.push(5);
        stack.displayStack();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
        System.out.println();
        stack.displayStack();
stack.push(12);
stack.displayStack();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }
}




