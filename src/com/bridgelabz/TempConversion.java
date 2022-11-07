package com.bridgelabz;

import java.util.*;

public class TempConversion {

    static Scanner sc = new Scanner(System.in);

    /*
     * Method to convert Celcius to Fahrenheit
     */
    static double C_F(double C) {
        double F = (C * 9 / 5) + 32;
        return F;
    }

      /*
       * Method to convert Fahrenheit to Celcius
       */
    static double F_C(double F) {
        double C = (F - 32) * 5 / 9;
        return C;
    }

       /*
        * Method to read the value of temperature given by the user
        */
    static double input(String word) {
        System.out.println("Enter " +word+ " value:");
        double val = sc.nextDouble();
        return val;
    }

       /*
        * Method to print converted value of temperature
        */
    static void output(double val, String word) {
        System.out.printf("%s value: %.2f", word, val);
    }

    public static void main(String args[]) {

        System.out.println("1. Celcius to Fahrenheit \n2. Fahrenheit to Celcius \n3. Exit");

        do {
            System.out.println("\nEnter Choice: ");
            int ch = sc.nextInt();
            double num;

            switch (ch) {
                case 1:
                    num = input("Celcius");
                    output(C_F(num), "Fahrenheit");
                    break;
                case 2: num = input("Fahrenheit");
                    output(F_C(num), "Celcius");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        } while (true);
    }
}