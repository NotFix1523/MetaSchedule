package com.metaschedule.roles;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaschedule.institute.Group;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    //Attributes
    Scanner scanner = new Scanner(System.in);
    ArrayList<Group> groups = new ArrayList<>();

    //Methods
    public void addGroup(){
        System.out.println("\nWhat's the name of the group?");
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("\nIn what language is it taught?");
        System.out.print("Enter the language: ");
        String language = scanner.nextLine();

        System.out.println("\nWhat is the name of the teacher?");
        System.out.print("Enter teacher's name: ");
        Teacher teacher = new Teacher(scanner.nextLine());

        groups.add(new Group(name,language,teacher));
    }
    public void importUser(){

    }
    public void exportUser() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("User.json"),toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "groups=" + groups +
                '}';
    }

    //Setters & Getters
    public ArrayList<Group> getGroups() {
        return groups;
    }
    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
