package com.example.testuploadimage;

public class Student {
    private String Name, Date, Faculty, Classroom, Scholastic, ID;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getClassroom() {
        return Classroom;
    }

    public void setClassroom(String classroom) {
        Classroom = classroom;
    }

    public String getScholastic() {
        return Scholastic;
    }

    public void setScholastic(String scholastic) {
        Scholastic = scholastic;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student(String name, String date, String faculty, String classroom, String scholastic, String ID) {
        Name = name;
        Date = date;
        Faculty = faculty;
        Classroom = classroom;
        Scholastic = scholastic;
        this.ID = ID;
    }
}
