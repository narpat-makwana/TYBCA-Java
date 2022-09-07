/*8. Define a class student having rollno, name and percentage.
Define Default and parameterized constructor.Overload the constructor. 
Accept the 5 student details and display it.(use this keyword). */
package com.assign_1.student;
// import java.util.*;
public class Student {
    int roll_no;
    String name;
    float per;

    public Student()
    {
        roll_no = 101;
        name = "Narpat";
        per = 87.22f;
    }

    public Student(int roll_no, String name,float per)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.per = per;
    }

    // public Student(String name)
    // {
    //     this.name = name;
    // }
    // public Student(int roll_no, float per)
    // {
    //     this.roll_no = roll_no;
    //     this.per = per;
    // }

    public void display()
    {
        System.out.println("Roll No : "+ roll_no +"\nName : "+ name +"\nPercentage : "+ per);
    }



}
