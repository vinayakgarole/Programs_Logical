package com.bridgelabz;

import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter date: ");
        int day = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        int y0 = year - (14 - month) / 12;
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        int m0 = (month) + ((12 * ((14 - month) / 12)) - 2);
        int d0 = (day + x + (31 * m0 / 12)) % 7;
        System.out.print("The month of week is: " +month+ " : ");

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        System.out.println("The day of week is: " +d0+ " : ");

        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
