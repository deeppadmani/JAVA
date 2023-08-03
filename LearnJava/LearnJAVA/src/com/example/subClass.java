package com.example;

import java.util.Scanner;

public class subClass {
    public static void SayHi()
    {
        System.out.println("Hi Deep!!");
    }

    public static void SayAge()
    {
        System.out.println("25");
    }

    public static String getName()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name : ");
        return input.nextLine();
    }

    public static int getAge()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        return input.nextInt();
    }
}
