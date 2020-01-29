package com.college.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student
{
    private int id;
    private String name;
    private int rank;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public Student(@JsonProperty("id")  int id, @JsonProperty("name") String name, @JsonProperty("rank") int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }
}
