package com.ravi;
import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temperature in Celsius: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: "+ tempF);
    }
}

