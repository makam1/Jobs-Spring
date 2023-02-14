package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;

public class SkillsEntity {
    @Id
    private String id;
    private String name;
    private Integer level;

    private String user;


    public SkillsEntity(String id, String name, Integer level, String user) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.user= user;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
