package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // get two numbers
        System.out.print("Enter First Number: ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter Next Number: ");
       int num2 = myScanner.nextInt();
       int sum = num1 + num2;

       System.out.println("The Sum Is: " + sum);

    }
}
