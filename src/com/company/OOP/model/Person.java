package com.company.OOP.model;

// abstract: trừu tượng
public abstract class Person {
    String name;
    int age;
    final String school = "UTC";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    // phương thức trừu tượng
    public abstract void xinChao();
}
