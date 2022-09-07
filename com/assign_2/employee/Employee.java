/*2. Define a class Employee having members – id, name,
department, salary. Define default and parameterized
constructors. Create a subclass called Worker with private
member bonus. Define methods accept and display in both the
classes. Create “n” objects of the Worker class and display the
details of the worker having the maximum total salary (salary
+ bonus). */
package com.assign_2.employee;
import java.util.*;
public class Employee {
    int id; 
    String name;
    String department;
    int salary;

    Employee()
    {
        id = 101;
        name = "Narpat";
        department = "BCA";
        salary = 10000;
    }

    Employee(int id, String name, String department, int salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ID : ");
        id = in.nextInt();
        System.out.println("Enter the Name : ");
        name = in.next();
        System.out.println("Enter the Department : ");
        department = in.next();
        System.out.println("Enter the Salary : ");
        salary = in.nextInt();

        in.close();

    }
    
    public void display()
    {
        System.out.println("ID : "+ id +"\nName : "+ name +"\nDepartment : "+ department +"\nSalary : "+salary );
    }
}
