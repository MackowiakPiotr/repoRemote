package friends.firstpackage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Stack stack = new Stack(8);
//        stack.push(8);
//        stack.push(6);
//        stack.push(4);
//        stack.push(4);
//        stack.push(4);
//        stack.push(4);
//        stack.push(4);
//        stack.push(5);
//        stack.displayStack();
//       stack.pop();
//       stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        System.out.println();
//        stack.displayStack();
//stack.push(12);
//stack.displayStack();
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.isFull());


        IntArray intArray = new IntArray();

        intArray.add(23);
        intArray.add(16);
        intArray.add(9);
        intArray.add(3);
        intArray.add(78);
        System.out.println(intArray);
        intArray.add(6);
        System.out.println(intArray);
        intArray.add(67);
        intArray.add(43);
        intArray.add(17);
        intArray.add(19);
        intArray.add(18);
        System.out.println(intArray);
        System.out.println(intArray.get(5));
        intArray.remove(9);
        intArray.swap(2,17);
        System.out.println(intArray);


    }
}




