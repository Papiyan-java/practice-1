package com.java.method;

 public class Person {
     private String name;
     private double height;
     protected int age;
     private char gender;


     protected Person() {
         name = "Andrey";
         height = 5.8;
         age = 47;
         gender = 'M';
     }

     protected void personalInfo() {
         System.out.print(name + " is a name");
         System.out.print(", " + height + " is how toll he is");
         System.out.print("hes gender is " + gender);

     }



     public static void main (String[]args){
             Person p = new Person();
             p.personalInfo();
             System.out.print(". "+" He is " + p.age + " years old");
             System.out.print(p.name.replaceAll(""," "));

         }


     }













