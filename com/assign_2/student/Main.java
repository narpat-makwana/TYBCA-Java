package com.assign_2.student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Student s1 = new Student();
        System.out.println(s1);

        System.out.println("Enter Roll No and Name : ");
        int rno = in.nextInt();
        String nm = in.next();
        Student s2 = new Student(rno, nm);
        System.out.println(s2);
        
        s1.display();
        s2.display();

        in.close();
    }
}
