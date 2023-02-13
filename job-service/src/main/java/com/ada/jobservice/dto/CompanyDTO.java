package com.ada.jobservice.dto;

import com.ada.jobservice.entities.enums.CompanyDomain;
import com.ada.jobservice.entities.enums.CompanySector;

public class CompanyDTO {
    private String id;
    private String ninea;
    private String denomination;
    private String description;
    private CompanySector sector;
    private CompanyDomain domain;
    private String headquaters;
    private  String officePhone;

    public CompanyDTO() {
    }

    public CompanyDTO(String id, String ninea, String denomination, String description, CompanySector sector, CompanyDomain domain, String headquaters, String officePhone) {
        this.id = id;
        this.ninea = ninea;
        this.denomination = denomination;
        this.description = description;
        this.sector = sector;
        this.domain = domain;
        this.headquaters = headquaters;
        this.officePhone = officePhone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompanySector getSector() {
        return sector;
    }

    public void setSector(CompanySector sector) {
        this.sector = sector;
    }

    public CompanyDomain getDomain() {
        return domain;
    }

    public void setDomain(CompanyDomain domain) {
        this.domain = domain;
    }

    public String getHeadquaters() {
        return headquaters;
    }

    public void setHeadquaters(String headquaters) {
        this.headquaters = headquaters;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
}
