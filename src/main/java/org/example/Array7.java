package org.example;
import java.util.Arrays;
public class Array7 {

    public static void main(String[] args) {


        int[] numbers = new int[10];
        System.out.println("Uneven numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
