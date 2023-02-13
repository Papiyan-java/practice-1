package com.java.method;


import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please inter first number");
        int a = sc.nextInt();
        System.out.println("Please inter second number");
        int b = sc.nextInt();


        System.out.println("Greatest number is: " + findMax(a,b));

    }

    static int findMax(int a,int b){
        if(a>b && a!=b) {
           return a;
        }else {
            return b;

        }
    }
}





