package com.cgi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Person {

    public enum SEX { MALE, FEMALE, UNKNOWN }

    String name;
    int age;
    private String email;
    String country;
    SEX sex;
    List<String> emails = new ArrayList<>();

    public Person(int age, String name, String country, SEX sex, List<String> emails) {
        this.age = age;
        this.name = name;
        this.country = country;
        this.sex = sex;
        this.emails = emails;
    }

    public Person(int age, String name, String country, SEX sex) {
        this(age, name, country, sex, new ArrayList<>());
    }

    public Person( int age, String name, String country) {
        this(age, name, null, SEX.UNKNOWN);
    }

    public Person(int age, String name) {
        this(age, name, null, SEX.UNKNOWN);
    }

    public Person(String name, int age) {
        this(age, name, null, SEX.UNKNOWN);
    }

}