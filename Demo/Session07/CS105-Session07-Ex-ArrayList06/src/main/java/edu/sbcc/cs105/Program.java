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

        ArrayList<Student> newDict = new ArrayList<Student>(studentList);

        studentList.get(0).setName("Roberto");

        for (Student s : newDict) {
            System.out.println(s.getName());
        }

    }
}