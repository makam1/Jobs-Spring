package com.ada.jobservice.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.File;

@Document("certification")
public class CertificationEntity {
    @Id
    private Integer id;

    private File FileName;


    public CertificationEntity(Integer id, File FileName) {
        super();
        this.id = id;
        this.FileName = FileName;
    }
}

