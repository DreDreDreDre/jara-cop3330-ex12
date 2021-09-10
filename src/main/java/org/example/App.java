package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        double principal;
        double rateInput;
        double rate;
        double interest;
        int numYears;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        rateInput = sc.nextDouble();
        rate = rateInput/100;

        System.out.print("Enter the number of years: ");
        numYears = sc.nextInt();

        interest = principal * (1 + (rate * numYears));
        System.out.printf("After %d years at %.4f%%, the investment will be worth $%.2f", numYears, rateInput, interest);

        sc.close();
    }
}
