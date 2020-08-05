package com.practicaljava.lesson2;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()/7%10);


//        create a Scanner
        Scanner input=new Scanner(System.in);

        System.out.println("What is The sum of "+number1+" and "+number2+" ?");
        int number=input.nextInt();
        System.out.println("The sum of "+number1+" and "+number2 +" is "+number+" and your answer is "+((number1+number2)==number));
    }
}
