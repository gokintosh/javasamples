package com.practicaljava.lesson2;

import java.util.Scanner;

public class SaleTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the purchase amount: ");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales Tax is :"+(int)(tax*100)/100.0);

    }

}
