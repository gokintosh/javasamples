package com.practicaljava.lesson2;

import java.util.Scanner;

public class FarenheitToCelcius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Enter a degree in farenheit");
        double farenheit=input.nextDouble();

//        convert to farenheit
        double celsius=(5.0/9)*(farenheit-32);
        System.out.println("farenheit "+farenheit + "is "+celsius +" in Celcius");
    }
}
