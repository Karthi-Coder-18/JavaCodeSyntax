package main.src.java;

public class ArraySyntax {

    public static void main(String[] args) {

        int[] array = new int[4];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(array.length);
        System.out.println(array); // when only the object reference variable is provided IDE has printed the object reference value

    }

    public int[] addValues(int[] number, String[] names, int data) {
        // Syntax to initilize an Array variable whenever it is declared inside a method as a parameter
        number = new int[]{10, 20, 30, 40}; // This is the way to provide values directly
        names = new String[4]; // This is the way to assign the number of values which will be added inside an array

        return number;
    }


}
