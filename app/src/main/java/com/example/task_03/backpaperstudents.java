package com.example.task_03;

public class backpaperstudents {
    public String studentemail;
    public String studentsub;
    public   String studentcgpa;

    public backpaperstudents(){

    }

    public backpaperstudents(String studentemail, String studentsub, String studentcgpa) {
        this.studentemail = studentemail;
        this.studentsub = studentsub;
        this.studentcgpa = studentcgpa;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public String getStudentsub() {
        return studentsub;
    }

    public String getStudentcgpa() {
        return studentcgpa;
    }
}
