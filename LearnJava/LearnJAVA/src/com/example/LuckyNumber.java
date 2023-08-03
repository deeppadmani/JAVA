package com.example;

import java.util.Scanner;

public class LuckyNumber {
    public static void CheckLuckyNumber()
    {
        System.out.println("Welcome to CheckLuckyNumber");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();

        int digit4 = number % 10;
        int digit3 = (number/10) % 10;
        int digit2 = (number/100) % 10;
        int digit1 = (number/1000) % 10;

        if(digit4 + digit3  == digit1 + digit2)
            System.out.println("Lucky Number");
        else
            System.out.println("Not a Lucky Number");
    }
}
