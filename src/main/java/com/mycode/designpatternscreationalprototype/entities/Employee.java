package com.mycode.designpatternscreationalprototype.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {
    private Integer salary;

    public Employee(String firstName, String lastName, Integer salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public Employee(Employee employee) {
        super(employee);
        if (employee != null) {
            this.salary = employee.getSalary();
        }
    }

    @Override
    public Person clone() {
        return new Employee(this);
    }
}
