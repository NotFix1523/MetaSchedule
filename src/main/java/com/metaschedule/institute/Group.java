package com.metaschedule.institute;

import com.metaschedule.roles.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    //Attributes
    public Scanner scanner = new Scanner(System.in);
    private String id,language;
    private Teacher teacher;
    private ArrayList<Session> sessions = new ArrayList<>();

    //Constructor
    public Group(String id, String language, Teacher teacher) {
        this.id = id;
        this.language = language;
        this.teacher = teacher;
        addSession();
    }

    //Methods
    private void addSession(){
        char opt;

        do{
            System.out.println("\nWhat classroom will be assigned?");
            System.out.print("Enter the classroom: ");
            String classroom = scanner.nextLine();

            System.out.println("\nWhat day will it be assigned?");
            System.out.println("These are the days available:");
            System.out.println("  1) MONDAY\n  2) TUESDAY\n  3) WEDNESDAY\n  4) THURSDAY\n  5) FRIDAY\n  6) SATURDAY\n  7) SUNDAY");
            System.out.print("Enter a number between 1 and 7: ");
            int day = scanner.nextInt();

            System.out.println("\nWhat will be the start time?");
            System.out.print("Enter a number between 0 and 24: ");
            int init_hour = scanner.nextInt();

            System.out.println("\nWhat will be the end time?");
            System.out.print("Enter a number between 0 and 24: ");
            int end_hour = scanner.nextInt();

            sessions.add(new Session(classroom,init_hour,end_hour,day));

            System.out.println("\nNew session added");

            System.out.print("\nDo you want to add another session? y/n: ");
            opt = scanner.next().charAt(0);
            scanner.nextLine();
        } while (opt == 'y');
    }
    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", language='" + language + '\'' +
                ", teacher=" + teacher +
                ", sessions=" + sessions +
                '}';
    }

    //Setters & Getters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }
    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }
}
