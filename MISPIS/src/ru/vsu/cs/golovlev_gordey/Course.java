package ru.vsu.cs.golovlev_gordey;

import java.util.ArrayList;

public class Course {
    private String name;
    private int id;
    private float hours;

    public Course(String name, int id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public void addCourse(Course[] courses){
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
