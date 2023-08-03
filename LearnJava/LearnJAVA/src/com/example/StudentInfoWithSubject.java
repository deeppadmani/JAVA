package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfoWithSubject extends Student{

    ArrayList<String> Subjects;

    public StudentInfoWithSubject(int Rollno){
        super(Rollno);

        this.Subjects = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter Subject :");
            this.Subjects.add(input.next());
            System.out.println("Do You Want To Enter one More Subject[Y/n] : " );
        }while('Y' == input.next().charAt(0));
    }

    public void getSubjectInfo()
    {
            System.out.println("Name : " + this.Name + "\n" + "RollNo: " + this.RollNo) ;
            System.out.println("Subjects: " + this.Subjects);
    }

}