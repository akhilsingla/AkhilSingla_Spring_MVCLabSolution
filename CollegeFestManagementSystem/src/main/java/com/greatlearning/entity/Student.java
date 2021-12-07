package com.greatlearning.entity;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Column(name = "Student_Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Department")
    private String department;
    @Column(name = "Country")
    private String country;
    public Student(String name, String department, String country) {
        this.name = name;
        this.department = department;
        this.country = country;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
