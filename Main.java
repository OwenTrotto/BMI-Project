package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        String name;
        int inches, pounds;
        double meters, kilograms, total, inch;
        String greeting, height, weight;
        Scanner Keyboard;

        name = "Owen";
        inches = 67;
        pounds = 135;
        meters = 0.0254;
        kilograms = 0.453592;
        inch = (inches*meters);


        Keyboard = new Scanner(System.in);




        System.out.println("Hello");
        greeting = Keyboard.nextLine();
        System.out.println("What's your name?");
        name = Keyboard.nextLine();
        System.out.println("How tall are you(inches)?");
        height = Keyboard.nextLine();
        System.out.println("How much do you weight(Pounds)?");
        weight = Keyboard.nextLine();
        System.out.println("Thank You");



        System.out.println("inches * meters is "+ (inches * meters));
        System.out.println("pounds * kilograms is "+ (pounds * kilograms));
        total = (pounds * kilograms) / (inch * inch);
        System.out.println("total: " + total);



































    }
}
