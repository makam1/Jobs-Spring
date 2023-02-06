package com.ada.jobservice.dto;

public class HobbyDTO {
    private Long id;
    private  String name;

    public HobbyDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public HobbyDTO() {
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
}
