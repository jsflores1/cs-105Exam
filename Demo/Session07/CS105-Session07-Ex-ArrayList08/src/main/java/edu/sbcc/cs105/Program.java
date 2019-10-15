package edu.sbcc.cs105;

import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        Student s1 = new Student("Bob");
        Student s2 = new Student("Maria");
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        
        studentList.add(0, new Student("Jose"));
        studentList.add(2, new Student("Vladamir"));
        

        printStudentList(studentList);

        // Expect Bob to be at position 1
        Student s = studentList.get(1);
        System.out.printf("%nStudent is Bob = %b%n", s.getName().equals("Bob"));

        // replace maria with bob - Invasion of the body snatchers!
        studentList.set(3, s);

        printStudentList(studentList);

        // Uh, oh. We have two Bobs (okay 2 refs to Bob)
        studentList.remove(1);

        printStudentList(studentList);

        
    }

    public static void printStudentList(ArrayList<Student> list){

        System.out.println();
        for (Student s : list) {
            System.out.println(s.getName());
        }
    }
}