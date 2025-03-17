package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", lName='" + lName + '\'' +
                ", student=" + student +
                '}';
    }

    @Id
    int lid;
    String lName;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @ManyToMany
    List<Student> student  = new ArrayList<>();

}
