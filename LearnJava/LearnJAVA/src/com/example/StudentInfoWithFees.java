package com.example;

import java.util.ArrayList;

public class StudentInfoWithFees extends StudentInfoWithSubject
{
    float Fees;
    public StudentInfoWithFees(float Fees,int RollNo)
    {
        super(RollNo);
        this.Fees = Fees;
    }

    public void getFeesInfo()
    {
        System.out.println("Fees: " + this.Fees);
    }
}
