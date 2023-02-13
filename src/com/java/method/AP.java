package com.java.method;

import java.util.Arrays;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        int num[] = {1, 5, 10, 7, 1};
        int max = 0;


        for (int i = 0; i < num.length; i++) {

            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum number is: " + max);


        String str = "123Hello123";

        System.out.println(str);
        int sum = 0;

        for (int i = 0; i < str.length(); ++i) {

            if (Character.isDigit(str.charAt(i))) {

                sum += Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println(sum);

        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number
        for (int i = 1; i <= number; i++) {
            System.out.println(number);



        }
    }
}
