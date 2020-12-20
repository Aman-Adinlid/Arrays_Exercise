package org.example;
import java.util.Arrays;
public class Array10 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        array = multiplication(10, 10);


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int[][] multiplication(int x, int y) {
        int[][] array1 = new int[x][y];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (i + 1) * (j + 1);
            }

        }
        return array1;
    }
}