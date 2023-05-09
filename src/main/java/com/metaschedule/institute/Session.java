package com.metaschedule.institute;

public class Session {
    //Attributes
    private String classroom;
    private int init_hour, end_hour, day;

    //Constructor
    public Session(String classroom, int init_hour, int end_hour, int day) {
        this.classroom = classroom;
        this.init_hour = init_hour;
        this.end_hour = end_hour;
        this.day = day;
    }

    //Methods
    @Override
    public String toString() {
        return "Session{" +
                "classroom='" + classroom + '\'' +
                ", init_hour=" + init_hour +
                ", end_hour=" + end_hour +
                ", day=" + day +
                '}';
    }

    //Setters & Getters
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getInit_hour() {
        return init_hour;
    }
    public void setInit_hour(int init_hour) {
        this.init_hour = init_hour;
    }

    public int getEnd_hour() {
        return end_hour;
    }
    public void setEnd_hour(int end_hour) {
        this.end_hour = end_hour;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}
