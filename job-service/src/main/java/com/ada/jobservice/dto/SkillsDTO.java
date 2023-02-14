package com.ada.jobservice.dto;

public class SkillsDTO {
    private String id;
    private String name;
    private Integer level;

    private String user;


    public SkillsDTO(String id, String name, Integer level, String user) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SkillsDTO() {
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
