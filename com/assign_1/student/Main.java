package com.assign_1.student;

public class Main {
    public static void main(String[] args) {
        Student stud = new Student();
        Student stud1 = new Student(112,"Rohan",71.2f);
        Student stud2 = new Student(113,"Vishal",78.3f);
        Student stud3 = new Student(114,"Anuj",74.2f);
        Student stud4 = new Student(115,"Akhilesh",81.6f);
        
        stud.display();
        stud1.display();
        stud2.display();
        stud3.display();
        stud4.display();
    }
}
