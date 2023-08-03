package com.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LearnArray
{
    public static int ScanArraySize()
    {
        System.out.print("Enter the Number Between (1 to 20) : ");

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println();

        if(size < 1 && size > 20)
        {
            System.out.print("Enter the Number Between (1 to 20) : ");
            size = input.nextInt();
        }

        return size;
    }
    public static void fillArray(int[] ary)
    {
        Scanner input = new Scanner(System.in);

        for(int Idx = 0;Idx < ary.length;Idx++) {
            System.out.print("Enter the Array[" + Idx + "] : ");
            ary[Idx] = input.nextInt();
        }
    }
    public static void fillArray(Point[] points)
    {
        Scanner input = new Scanner(System.in);

        for(int Idx = 0;Idx < points.length;Idx++) {
            System.out.print("Enter the Array[" + Idx + "] : ");
            points[Idx] = new Point(input.nextInt(),input.nextInt());
        }
    }
    public static void printArray(int[] ary)
    {
        for(int Idx = 0;Idx < ary.length;Idx++)
            System.out.print(ary[Idx] + " ");
    }
    public static void printArray(Point[] points)
    {
        for(int Idx = 0;Idx < points.length;Idx++) {
            System.out.println("Point["+ Idx +"] --> (" + points[Idx].x + "," + points[Idx].y + ")");
        }
    }
    public static void sumArray(int[] ary)
    {
        int sum = 0;
        for(int Idx = 0;Idx < ary.length;Idx++)
        {
            sum += ary[Idx];
        }
        System.out.println("Sum = " + sum);
    }
    public static void productArray(int[] ary)
    {
        int product = 1;
        for(int Idx = 0;Idx < ary.length;Idx++)
        {
            product *= ary[Idx];
        }
        System.out.println("product = " + product);
    }
    public static void avgArray(int[] ary)
    {
        double avg = 0;
        for(int Idx = 0;Idx < ary.length;Idx++)
        {
            avg += ary[Idx];
        }
        avg /= ary.length;
        System.out.println("avg = " + avg);
    }
    public static int getNumberOccurs(int[] ary , int num)
    {
        int count = 0;
        for(int Idx = 0;Idx < ary.length;Idx++)
        {
            if(ary[Idx] == num)
                count++;
        }
        return count;
    }
    public static void printNumOccures(int[] ary)
    {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the Number : ");
        num = input.nextInt();

        count = getNumberOccurs(ary,num);
        System.out.println(num + " occurs "+ count + " times");
    }
    public static void MinMax(int[] ary)
    {
        int max = ary[0];
        int min = ary[0];

        for(int Idx = 1;Idx < ary.length;Idx++)
        {
            if(max < ary[Idx])
                max = ary[Idx];
            else if(min > ary[Idx])
                min = ary[Idx];
        }
        System.out.println("Max = " + max + " Min = " + min);
    }
    public static int[] SortOddEven(int[] ary)
    {
        int[] arySorted = new int[ary.length];
        int evenIdx = 0,oddIdx = ary.length - 1;
        int Idx = 0;
        while(Idx < ary.length)
        {
            if(ary[Idx] % 2 == 0) {
                arySorted[evenIdx] = ary[Idx];
                evenIdx++;
            }
            else{
                arySorted[oddIdx] = ary[Idx];
                oddIdx--;
            }
            Idx++;
        }
        return arySorted;
    }
    public static void fillArray(int[][] ary2D)
    {
        Scanner input = new Scanner(System.in);

        for(int Idx = 0;Idx < ary2D.length;Idx++) {
            for(int Idx2 = 0;Idx2< ary2D[0].length;Idx2++) {
                System.out.print("Enter the Array[" + Idx + "]["+Idx2+"] : ");
                ary2D[Idx][Idx2] = input.nextInt();
            }
        }
    }

    public static void printArray(int[][] ary2D)
    {
        for(int Idx = 0;Idx < ary2D.length;Idx++) {
            for(int Idx2 = 0;Idx2< ary2D[0].length;Idx2++) {
                System.out.print(ary2D[Idx][Idx2] + ",");
            }
            System.out.println();
        }
    }

    public static void rowSumOf2DArray(int[][] ary2D)
    {
        int Sum = 0;
        for(int Idx = 0;Idx < ary2D.length;Idx++) {
            for (int Idx2 = 0; Idx2 < ary2D[0].length; Idx2++) {
                Sum += ary2D[Idx][Idx2];
            }
            System.out.println("Sum of Row "+ (Idx+1) +": "+ Sum);
            Sum = 0;
        }
    }

    public static void MaxofEachRowOf2DArray(int[][] ary2D)
    {
        int Max;
        for(int Idx = 0;Idx < ary2D.length;Idx++) {
            Max = ary2D[Idx][0];
            for (int Idx2 = 0; Idx2 < ary2D[0].length; Idx2++) {
                if(Max < ary2D[Idx][Idx2])
                    Max = ary2D[Idx][Idx2];
            }
            System.out.println("Max of Row "+ (Idx+1) +": "+ Max);
        }
    }

    public static void ArraytListOp(ArrayList<Integer> aryList)
    {
        while(true)
        {
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Select the option : ");

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            int data;
            switch (option) {
                case 1:
                    System.out.print("Enter the data: ");
                    data = input.nextInt();
                    aryList.add(data);
                    break;
                case 2:
                    System.out.print("Enter the data: ");
                    int elementToRemove = input.nextInt();
                    aryList.remove(elementToRemove);
                    break;
                case 3:
                    System.out.println(aryList);
                    break;
                default:
                    break;
            }
            if(option != 1 ||
               option != 2 ||
               option != 3
            )
                break;
        }
    }
}

