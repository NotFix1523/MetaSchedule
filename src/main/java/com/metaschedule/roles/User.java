package com.metaschedule.roles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.metaschedule.institute.Group;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    //Attributes
    Scanner scanner = new Scanner(System.in);
    ArrayList<Group> groups = new ArrayList<>();

    //Constructor
    public User() {

    }

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

        Group group = new Group(name,language,teacher);
        groups.add(group);
    }
    public static void importUser(){
    }
    public void exportUser() {
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
