package selections;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int number=input.nextInt();

        if(number%5==0)
            System.out.println("HiFive");
        if (number%2==0)
            System.out.println("hi two");
        else
            System.out.println("hi Odd");
    }
}
