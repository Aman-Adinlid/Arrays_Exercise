package org.example;
import java.util.Arrays;
public class Array9 {

    public static void main(String[] args) {
         int [] array = {1,3,4,6};
        System.out.println(Arrays.toString(array));

        int [] array2 = Arrays.copyOf(array, array.length + 2);
        array2 [1] = 3;
        array2 [3] = 5;
        array2 [4] = 6;
        array2 [6] = 8;
        System.out.println();


    }
}
