package com.mycode.designpatternscreationalprototype.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(Person person) {
        if (person != null) {
            this.firstName = person.getFirstName();
            this.lastName = person.getLastName();
        }
    }

    public abstract Person clone();
}
