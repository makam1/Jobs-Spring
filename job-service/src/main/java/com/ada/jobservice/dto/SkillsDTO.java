package com.ada.jobservice.dto;

public class SkillsDTO {
    private Long id;
    private String name;
    private Integer level;

    public SkillsDTO(Long id, String name, Integer level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public SkillsDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
