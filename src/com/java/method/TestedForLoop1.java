package com.java.method;



public class TestedForLoop1 {
    public static void main(String[] args) {


        for (int a = 0; a <= 9; a++) {

            for (int s = 1; s >= 2 - a; s--) {
                System.out.print(" ");
            }
            for (int b = 9 * 2 - 2; b >= a * 2; b--) {
                System.out.print("A");
            }
            System.out.println();
        }

        for (int a = 1; a <= 5; a++) {
            System.out.println();
            for (int b = 4; b >= a; b--) {
                System.out.print("A");
            }


        }
    }
}




