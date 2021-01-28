package com.algorithmpractice.javapractice.declarative;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsFunctionalProgramming {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE)
        );

        //Imperative Approach
        List<Person> females = new ArrayList();

        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        System.out.println("IMPERATIVE");
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println();

        //Declarative Approach
        System.out.println("DECLARATIVE");
        List<Person> females2 = people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females2.forEach((person) -> System.out.println(person));

    }

    public static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    public enum Gender {
        MALE, FEMALE
    }
}
