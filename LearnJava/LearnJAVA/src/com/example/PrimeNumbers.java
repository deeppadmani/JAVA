package com.example;

public class PrimeNumbers
{
    public static boolean isPrime(int number)
    {
        for(int num = 2 ; num <= number/2 ; num++)
            if(number % num == 0)
                return false;
        return true;
    }

    public static void printPrimeBetween(int start,int end)
    {
        for(int number = start; number <= end;number++)
            if (isPrime(number))
                System.out.print(number + " ");
    }
}
