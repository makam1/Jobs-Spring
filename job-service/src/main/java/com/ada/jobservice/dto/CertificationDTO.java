package com.ada.jobservice.dto;

public class CertificationDTO {
    private Long id;

    public CertificationDTO(Long id) {
        this.id = id;
    }

    public CertificationDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
