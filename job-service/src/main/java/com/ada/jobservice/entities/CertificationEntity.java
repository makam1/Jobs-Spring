package com.ada.jobservice.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.File;

@Document("certification")
public class CertificationEntity {
    @Id
    private Long id;
    private File FileName;
    public Long getId() {
        return id;
    }

    public File getFileName() {
        return FileName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFileName(File fileName) {
        FileName = fileName;
    }

    public CertificationEntity(Long id, File FileName) {
        super();
        this.id = id;
        this.FileName = FileName;
    }
}
