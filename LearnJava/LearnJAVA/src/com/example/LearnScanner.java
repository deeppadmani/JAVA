package com.example;
import java.util.Scanner;

public class LearnScanner {
    public static void Scan()
    {
        System.out.println("Welcome to Scanner class");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Int Value :");
        int VarInt = input.nextInt();

        System.out.print("Enter String Value :");
        String VarStr = input.next();

        System.out.print("Enter nextBoolean Value :");
        Boolean VarBool = input.nextBoolean();

        System.out.print("Enter char Value :");
        char VarChar = input.next().charAt(0);

        System.out.print("Enter Short Value :");
        short VarShort = input.nextShort();

        System.out.println("VarInt : "+ VarInt + "  VarStr : "+ VarStr + "  VarBool : "+ VarBool + "  VarChar : " + VarChar + "  VarShort : " + VarShort);
    }
}
