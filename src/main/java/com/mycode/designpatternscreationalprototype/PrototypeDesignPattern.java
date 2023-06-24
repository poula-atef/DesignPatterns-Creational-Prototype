package com.mycode.designpatternscreationalprototype;

import com.mycode.designpatternscreationalprototype.entities.Student;

public class PrototypeDesignPattern {
    public static void main(String[] args) {
        Student student1 = new Student("Peter","Parker",80);
        // will print 80
        System.out.println(student1.getFullGrade());

        Student student2 = (Student) student1.clone();
        // will print 80
        System.out.println(student2.getFullGrade());

        student2.setFullGrade(100);
        // will print 80
        System.out.println(student1.getFullGrade());
        // will print 100
        System.out.println(student2.getFullGrade());

    }
}
