package com.company;

/**
 * Created by bohdan.novosad on 23.09.2016.
 */
public class Candidate extends Person {
    private String part;

    public Candidate(String firstName, String lastName, int age, String part) {
        super(firstName, lastName, age);
        this.part = part;
    }

    public Candidate(Person person, String part){
        super(person);
        this.part = part;
    }
}
