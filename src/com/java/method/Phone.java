package com.java.method;

public class Phone {
    String color;
    int sizeOfRam;
    int cameraMegaPixel;
    String model;

    void call(String number) {
        System.out.println("Calling from " + model + " that have " + cameraMegaPixel + " MegaPixel camera " + " to the number " +
                number);
    }

    public static void main(String[] args) {

        Phone iPhone10 = new Phone();
        iPhone10.cameraMegaPixel = 12;
        iPhone10.model = "Apple iPhone10";
        iPhone10.call("1234587");

    }
}
