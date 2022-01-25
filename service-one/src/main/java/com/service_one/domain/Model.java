package com.service_one.domain;

public class Model {
    private long id;
    private String name;
    private String age;
    private String gender;

    public Model(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Model() {
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
