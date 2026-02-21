package com.neerad;
public class Student {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getId() {
        return id;
    }

    public String getTech() {
        return tech;
    }

    private String tech;
}
