package org.example;

import java.util.Arrays;
import java.util.Arrays;
public class Array8 {

    public static void main(String[] args) {
        int [] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Arrays.sort(array);
        int length = array.length;
        int j = 0;

        for (int i = 0; i <length-1; i++)
            if (array[i]!=array[i + 1]) {
                array[j++] = array[i];
            }
        array[j++] = array[length - 1];

        int e;
        for (e = 0; e< j; e++){
            System.out.print(array[e] +" ");
        }
    }
}
