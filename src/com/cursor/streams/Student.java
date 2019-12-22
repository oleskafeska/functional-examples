package com.cursor.streams;

import java.util.List;

public class Student {

    private String id;

    private String name;

    private Integer age;

    private List<String> classes;

    public Student(String id, String name, Integer age, List<String> classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
