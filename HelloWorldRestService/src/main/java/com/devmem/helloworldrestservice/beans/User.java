package com.devmem.helloworldrestservice.beans;

public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
