package com.metaschedule.roles;

public class Teacher {
    //Attributes
    String name;

    //Constructor
    public Teacher(String name) {
        this.name = name;
    }

    //Methods
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    //Setters & Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
