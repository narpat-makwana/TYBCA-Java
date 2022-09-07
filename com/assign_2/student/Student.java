/*3. Define a class Student with attributes rollno and name.
Define default and parameterized constructor. Override the
toString () method. Keep the count of Objects created. Create
objects using parameterized constructor and Display the
object count after each object is created. */
package com.assign_2.student;

public class Student {
    int rollno;
    String name;
    static int cnt;

    Student() {
        cnt++;
        rollno = 101;
        name = "Rohan";
    }

    Student(int rollno, String name) {
        cnt++;
        this.rollno = rollno;
        this.name = name;
    }

    public String toString() {
        return "Number of objects created are : " + cnt;
    }

    public void display() {
        System.out.println("\nRoll No : " + rollno + "\nName : " + name);
        System.out.println();
    }

}
