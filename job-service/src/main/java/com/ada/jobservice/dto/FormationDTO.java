package com.ada.jobservice.dto;

import java.util.Date;

public class FormationDTO {
    private String id;
    private String degree;
    private String  name;
    private String schoolName;
    private  String schoolCity;
    private Date startDate;
    private Date endDate;
    private String user;

    public FormationDTO() {
    }

    public FormationDTO(String user,String id, String degree, String name, String schoolName, String schoolCity, Date startDate, Date endDate) {
        this.id = id;
        this.degree = degree;
        this.name = name;
        this.schoolName = schoolName;
        this.schoolCity = schoolCity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.user=user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
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
}
