package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double a = sc.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double b = sc.nextDouble();
        b = (b / 100) / 12;
        System.out.print("Enter Time period in years : ");
        double c = sc.nextInt();
        c = c * 12;
        double pay = Payment(a, b, c);
        System.out.println("Payment: " +pay);
    }

    static double Payment(double p, double r, double t) {
        double m = (p * r) / (1 - Math.pow(1 + r, -t));
        m = Math.round(m * 100) / 100;
        return m;
    }
}
