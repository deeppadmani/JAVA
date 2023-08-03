package com.example;

import java.util.Scanner;
public class LearningTask
{
    public static void StrictDivisor()
    {
        System.out.println("Welcome to StrictDivisor");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();

        for(int Idx = 1;Idx <= number/2;Idx++)
            if(number % Idx == 0)
                System.out.print(Idx + " ");
    }

    public static void MaxMin()
    {
        System.out.println("Welcome to MaxMin");

        int Max = 0,Min = 0;
        int number ;

        Scanner input = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter the Number : ");
            number = input.nextInt();
            if(number < 0)
                break;
            if (number > Max)
                Max = number;
            else if (number < Min)
                Min = number;
        }

        System.out.println("Max = " + Max + "  Min = " + Min);
    }

    public static void addSpaceAfterChar()
    {
        System.out.println("Welcome to addSpaceAfterChar");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = input.nextLine();

        for(int Idx = 0;Idx<= str.length()-1;Idx++)
        {
            System.out.print(str.charAt(Idx) + " ");
        }
    }
}
