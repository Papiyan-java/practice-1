package com.java.method;

import java.util.Scanner;

public class InClassPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter number");
        int num = sc.nextInt();
        int cont = 0;

        for (int a = 2; a < num; a++) {
            if (num % a == 0) {
                System.out.println(a);
                cont++;
            }
        }
        if (cont == 0){
            System.out.print(num + " is a prime number");
             }else{
            System.out.println(num + " a not prime");

        }
   }
}
