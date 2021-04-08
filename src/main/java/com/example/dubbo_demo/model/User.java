package com.example.dubbo_demo.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int id;

    private String name;

    private int sex;

    private Date Birthday;

    public User(int id, String name, int sex, Date birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        Birthday = birthday;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }


}
