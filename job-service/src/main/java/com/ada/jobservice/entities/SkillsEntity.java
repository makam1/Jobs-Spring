package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;

public class SkillsEntity {
    @Id
    private String id;
    private String name;
    private Integer level;

    public SkillsEntity(String id, String name, Integer level) {
        this.id = id;
        this.name = name;
        this.level = level;
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
