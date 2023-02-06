package com.ada.jobservice.dto;

import com.ada.jobservice.entities.enums.LangageLevel;

public class LangageDTO {
    private Long id;
    private String name;
    private LangageLevel level;

    public LangageDTO(Long id, String name, LangageLevel level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public LangageDTO() {
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

    public LangageLevel getLevel() {
        return level;
    }

    public void setLevel(LangageLevel level) {
        this.level = level;
    }
}
