package com.practicaljava.lesson2;

import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter annual interest rate eg.7.32%");
        double annualInterestRate=input.nextDouble();

//        obtaining monthly interest rate
        double monthlyInterestRate=annualInterestRate/1200;

//        enter no of years
        System.out.println("Enter the number of years eg:5");
        int numberOfYears=input.nextInt();

//        Enter loan amount
        System.out.println("Enter the loan amount");
        double loanAmount=input.nextDouble();

//        calculate the loan
        double monthlyPayment=loanAmount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));

//        print
        System.out.println("your monthly payment amount is:"+monthlyPayment);

    }
}
