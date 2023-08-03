package com.example;

import java.util.Scanner;

public class Calculator {
    public static void Calc() {
        System.out.println("Welcome to Calculator");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number1 operator Number2: (ex : 1 + 2) :");
        double Num1 = input.nextInt();
        String op = input.next();
        double Num2 = input.nextInt();

        switch (op)
        {
            case "+":
                System.out.println(Num1 + op + Num2 + " = " + (Num1+Num2));
                break;
            case "-":
                System.out.println(Num1 + op + Num2 + " = " + (Num1-Num2));
                break;
            case "*":
                System.out.println(Num1 + op + Num2 + " = " + (Num1*Num2));
                break;
            case "/":
                System.out.println(Num1 + op + Num2 + " = " + (Num1/Num2));
                break;
            default:
                System.out.println("Invalid Op");
                break;
        }
    }
    public static void SumTill()
    {
        System.out.println("Welcome to SumTill");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Sum Range :");
        int Range = input.nextInt();
        int number = 0, sum = 0;
        while(sum < Range)
        {
           System.out.print("Enter the number :");
           sum += input.nextInt();
        }
        System.out.println("Done Sum = " + sum);
    }

}
