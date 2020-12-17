package org.example;
import java.util.Arrays;
public class Array5 {

    public static void main(String[] args) {


        String[][] cityCountry = new String[2][2];

        cityCountry[0][0] = "France";
        cityCountry[0][1] = "Paris";

        cityCountry[1][0] = "Sweden";
        cityCountry[1][1] = "Stockholm";

        for (String[] country : cityCountry) {
            for (String value : country) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}