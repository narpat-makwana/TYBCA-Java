package com.assign_2.employee;
import java.util.Scanner;
public class Worker extends Employee
{
    private int bonus;
    int totalSal = 0;
    public void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Bonus : ");
        bonus = in.nextInt();
        in.close();
    }
    
    public void display()
    {
        System.out.println("Bonus : "+ bonus );
    }
    public void maxTotalSal()
    {
         totalSal = salary + bonus;
    }
}
