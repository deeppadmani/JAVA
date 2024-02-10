package com.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Deep";
        String name1 = name;
        name = "Padmani";
//        System.out.println("Hello world!" + name);
//        System.out.println(args[0]);
//        subClass.SayHi();
//        subClass.SayAge();
//        LearnScanner.Scan();
//        EvenOdd.CheckEvenOdd();
//        Calculator.Calc();
        LuckyNumber.CheckLuckyNumber();
//        EvenOdd.ListEvenNumber();
//        Calculator.SumTill();
//        LearningTask.StrictDivisor();
//        LearningTask.MaxMin();
//        LearningTask.addSpaceAfterChar();
//        System.out.println(subClass.getName() + " --> " + subClass.getAge());
//        PrimeNumbers.printPrimeBetween(1,50);

//        int size = LearnArray.ScanArraySize();
//        int[] ary = new int[size];
//        int[] arySorted;
//        LearnArray.fillArray(ary);
//        LearnArray.printArray(ary);
//        LearnArray.avgArray(ary);
//        LearnArray.productArray(ary);
//        LearnArray.sumArray(ary);
//        LearnArray.printNumOccures(ary);
//        LearnArray.MinMax(ary);
//        arySorted = LearnArray.SortOddEven(ary);
//        LearnArray.printArray(arySorted);

//*************************************************************************************//

//        Point []points = new Point[size];
//        LearnArray.fillArray(points);
//        LearnArray.printArray(points);

//*************************************************************************************//

//        int[][] ary2D = new int[3][5];
//        LearnArray.fillArray(ary2D);
//        LearnArray.printArray(ary2D);
//        LearnArray.rowSumOf2DArray(ary2D);
//        LearnArray.MaxofEachRowOf2DArray(ary2D);

//*************************************************************************************//

//        ArrayList<Integer> aryList = new ArrayList<>();
/*        int totalElements,temp;
        Scanner input = new Scanner(System.in);
        totalElements = input.nextInt();
        for (int Idx = 0; Idx < totalElements; Idx++)
        {
            temp = input.nextInt();

            if(!aryList.contains(temp))
                aryList.add(temp);
        }
        Collections.sort(aryList);
        System.out.println(aryList);

        System.out.println("ArrayList Add Remove Display Task: ");*/

//        LearnArray.ArraytListOp(aryList);
//**************************************** Rectangle ******************************************************/
/*
        Rectangle[] Rectangles = new Rectangle[3];

        Scanner input = new Scanner(System.in);
        for(int Idx = 0;Idx<Rectangles.length;Idx++)
        {
            System.out.print("Do you want to Enter the data (Y/n) : ");
            char choice = input.next().charAt(0);
            if('y' == choice){
                System.out.println("Enter height and width :");
                Rectangles[Idx] = new Rectangle(input.nextDouble(), input.nextDouble());
            }
            else if('n' == choice){
                Rectangles[Idx] = new Rectangle();
            }
            else
            {
                System.out.println("Invalid Choice");
            }
        }

        for(int Idx = 0;Idx<Rectangles.length;Idx++)
            System.out.println("Height :"+Rectangles[Idx].getHeight() +
                    "   Width :"+Rectangles[Idx].getWidth() +
                    "   Area :" + Rectangles[Idx].getArea());
                    */
//**************************************** Account ******************************************************/

        /*
        Account testAcc = new Account(1112,20000,4.5);
        if(testAcc.withdraw(2500))
            System.out.println("Withdraw : " + (20000 - testAcc.getBalance()) + "   New Balance is : " + testAcc.getBalance());
        else
            System.out.println("Isufficient Balance");

        testAcc.deposit(3000);
        System.out.println("Account Id: " + testAcc.getId() +
                "    Account Balance :" + testAcc.getBalance() +
                "    Date Created : " + testAcc.getDateCreated());
        */
//**************************************** Client ******************************************************/

    /*    Client[] Clients = new Client[2];
        Clients[0] = new Client(100,"Deep","4696055923");
        Clients[0].addAccount(new Account(1,1000,1.5));
        Clients[0].addAccount(new Account(2,1500,2));



        Clients[1] = new Client(200,"Rubina","4696055922");
        Clients[1].addAccount(new Account(1,1000,1.5));
        Clients[1].addAccount(new Account(2,1500,2));
        Clients[1].addAccount(new Account(3,2000,2.5));

        System.out.println(Clients[0].toString());
        System.out.println(Clients[1].toString());*/


//**************************************** Client ******************************************************/
       /*  ArrayList<Account> accounts = new ArrayList<>();

        Client client = new Client(100,"Deep","4696055923");
        accounts.add(new Account(1,1000,1.5,client));
        accounts.add(new Account(2,1500,2,client));

        accounts.get(0).withdraw(2000);
        accounts.get(0).deposit(3000);
        accounts.get(0).withdraw(1500);

        accounts.get(1).withdraw(2000);
        accounts.get(1).deposit(3000);
        accounts.get(1).withdraw(1500);
        accounts.get(1).withdraw(1500);

        for(Account account: accounts){
            System.out.println("Account : "+ account.getId()+ ":" );
            System.out.println("W: "+ account.countTransaction('W'));
            System.out.println("D: "+ account.countTransaction('D'));
        }*/

//**************************************** Student (Single inheritance) ******************************************************/

/*        Student student = new Student(1);
        student.getInfo();

        StudentInfoWithSubject StudentAllInfo = new StudentInfoWithSubject(1);
        StudentAllInfo.getInfo();
*/
//**************************************** Student (Multiple inheritance) & Hierarchical  ******************************************************/

        /*StudentInfoWithFees StudentAllInfoFees = new StudentInfoWithFees(3000,3);
        StudentAllInfoFees.getSubjectInfo();
        StudentAllInfoFees.getStudentInfo();
        StudentAllInfoFees.getFeesInfo();*/

//**************************** Not Support Multilevel inheritance ******************************************

//**************************** Inner Class *****************************************************************
        //OuterClass.Inner in = new OuterClass().new Inner();
        //in.show();

//**************************** Anonymous Inner Class & Interface & abstract class ***************************
       // MyClass obj = new MyClass();
        //obj.getAge();


//**************************** equals ***************************
        /*  String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2));  //true
        System.out.println(myStr1.equals(myStr3));  //false*/
/************************************************************ */

       /*  int[] groupSizes = {3,3,3,3,3,1,3};
        List_and_HashMap var = new List_and_HashMap();
        List<List<Integer>> temp = new ArrayList<>();
        temp = var.groupThePeople(groupSizes);*/

        //Solution Svar;
        int var = Solution.minDeletions("aaabbbcc");
        System.out.println(var);
    }
}
