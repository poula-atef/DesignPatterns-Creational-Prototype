package com.mycode.designpatternscreationalprototype.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {

    private Integer fullGrade;

    public Student(String firstName, String lastName, Integer fullGrade) {
        super(firstName, lastName);
        this.fullGrade = fullGrade;
    }

    public Student(Student student) {
        super(student);
        if (student != null) {
            this.fullGrade = student.getFullGrade();
        }
    }

    @Override
    public Person clone() {
        return new Student(this);
    }
}
