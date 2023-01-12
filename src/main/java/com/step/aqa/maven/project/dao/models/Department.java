package com.step.aqa.maven.project.dao.models;

import javax.persistence.*;

@Entity(name = "departments")

public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @Column(name = "Name")
    String name;
    @Column(name = "Building")
    int building;
    @Column(name = "Finansing")
    Double financing;

    public Department() {
    }

    public Department(long id, String name, int building, int floor, Double financing) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.financing = financing;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }


    public Double getFinancing() {
        return financing;
    }

    public void setFinancing(Double financing) {
        this.financing = financing;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", building=" +
                ", financing=" + financing +
                '}';
    }
}
