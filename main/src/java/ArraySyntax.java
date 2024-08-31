package main.src.java;

public class ArraySyntax {

    public static void main(String[] args) {

        int[] array = new int[4];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;

        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println(array.length);
        System.out.println(array); // when only the object reference variable is provided IDE has printed the object reference value

    }


}
