package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("certification")
public class CertificationEntity {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertificationEntity(String id) {
        super();
        this.id = id;
    }
}

