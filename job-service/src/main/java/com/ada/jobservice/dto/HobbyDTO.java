package com.ada.jobservice.dto;

public class HobbyDTO {
    private String id;
    private  String name;

    public HobbyDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public HobbyDTO() {
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
