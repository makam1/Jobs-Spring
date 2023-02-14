package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;

public class HobbiesEntity {

     @Id
    private String id;
    private  String name;
    private String user;

    public HobbiesEntity(String user,String id, String name) {
        this.id = id;
        this.name = name;
        this.user=user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
}
