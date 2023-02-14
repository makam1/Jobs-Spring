package com.ada.jobservice.dto;

import com.ada.jobservice.entities.enums.LangageLevel;

public class LangageDTO {
    private String id;
    private String name;
    private LangageLevel level;
    private String user;


    public LangageDTO(String id, String name, LangageLevel level, String user) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.user=user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LangageDTO() {
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

    public LangageLevel getLevel() {
        return level;
    }

    public void setLevel(LangageLevel level) {
        this.level = level;
    }
}
