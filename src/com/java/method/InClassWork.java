package com.java.method;

import java.util.Scanner;

public class InClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter number");
        int num = sc.nextInt();
        int originalNum=num;
        int rev=0 ;

        while (num!=0){
           int lastDigit =num%10;
           rev=rev* 10+lastDigit;
           num=num/10;
        }
        if(originalNum==rev) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");

        }


    }


}
