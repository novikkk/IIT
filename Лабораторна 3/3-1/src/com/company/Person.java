package com.company;

/**
 * Created by bohdan.novosad on 23.09.2016.
 */
public class Person {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(Person person){
        this.age = person.getAge();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
    }
}
