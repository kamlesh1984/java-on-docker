package com.praqma.academy.simplejavaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.inject.Singleton;
import javax.ws.rs.NotFoundException;

@Singleton
//@RequestScoped
public class PersonDatabase {

    List<Person> persons;

    @PostConstruct
    public void init() {
        System.out.println("DB init");
        Person[] list= new Person[]{
            new Person("Penny"), 
            new Person("Leonard"), 
            new Person("Sheldon"), 
            new Person("Amy"), 
            new Person("Howard"), 
            new Person("Bernadette"), 
            new Person("Raj"), 
            new Person("Priya")};
        persons = new ArrayList<>(Arrays.asList(list));
    }

    public Person[] currentList() {
        return persons.toArray(new Person[0]);
    }
    public void addPerson (Person person){
    persons.add(person);
    }

    public Person getPerson(int id) {
        if (id < persons.size()) {
            return persons.get(id);
        }

        throw new NotFoundException("Person with id \"" + id + "\" not found.");
    }
}
