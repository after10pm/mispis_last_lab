package ru.vsu.cs.golovlev_gordey;

public class Lecturer extends ResearchAssociate {
    private Course[] courses;

    public Lecturer(Course[] courses) {
        super();
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        //
    }
}
