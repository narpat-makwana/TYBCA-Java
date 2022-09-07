/*7. Write a Java Program which define class Employee with data member as id, name and salary 
Store the information of n employees and Display the name of employee having maximum salary 
(Use array of object). */

package com.assign_1.employee;
import java.util.Scanner;
public class Employee {
    int id;
    String name;
    int salary;

    public void setdata()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Id : ");
        id = in.nextInt();
        System.out.println("Enter Name : ");
        name = in.next();
        System.out.println("Enter Salary : ");
        salary = in.nextInt();
        in.close();
    }
    public void getdata()
    {
        System.out.println("ID : " + id + "\nName : " + name + "\nSalary : " + salary);
    }
}
