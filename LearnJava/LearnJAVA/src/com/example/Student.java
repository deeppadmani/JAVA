package com.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Student
{
     String Name;
     int RollNo;

    public Student(int RollNo)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name :");
        this.Name = input.next();
        this.RollNo = RollNo;
    }

    public void getStudentInfo()
    {
        System.out.println("Name : " + this.Name + "\n" + "RollNo: " + this.RollNo);
    }
}

