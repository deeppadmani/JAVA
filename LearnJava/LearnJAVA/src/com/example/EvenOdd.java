package com.example;

import java.util.Scanner;

public class EvenOdd
{
    public static void CheckEvenOdd()
    {
        System.out.println("Welcome to CheckEvenOdd");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();

        if(number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void ListEvenNumber()
    {
        System.out.println("Welcome to ListEvenNumber");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int Range = input.nextInt();

        for(int number = 1 ; number <= Range ; number++)
        if(number % 2 == 0)
            System.out.print(number + " ");
    }
}
