package com.ada.jobservice.dto;

public class HobbyDTO {
    private String id;
    private  String name;

    private String user;


    public HobbyDTO(String id, String name, String user) {
        this.id = id;
        this.name = name;
        this.user= user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
