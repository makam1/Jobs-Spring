package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("experience")
public class ExperienceEntity {

    @Id
    private String id;
     private Date startDate;
     private Date endDate;
     private String function;
     private String companyName;
     private String realisation;

    public ExperienceEntity(String id,Date startDate, Date endDate, String function, String companyName, String realisation) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.function = function;
        this.companyName = companyName;
        this.realisation = realisation;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRealisation() {
        return realisation;
    }

    public void setRealisation(String realisation) {
        this.realisation = realisation;
    }
}
