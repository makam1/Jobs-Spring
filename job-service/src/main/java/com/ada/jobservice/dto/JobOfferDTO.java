package com.ada.jobservice.dto;

import com.ada.jobservice.entities.SkillsEntity;
import com.ada.jobservice.entities.enums.ContractType;

import java.util.Date;

public class JobOfferDTO {
    private Long id;
    private String title;
    private String companyName;
    private String companyAddress;
    private Date limitDate;
    private ContractType contractType;
    private SkillsEntity requiredSkills;
    private  Long minSalary;
    private Long maxSalary;
    private String description;

    public JobOfferDTO(Long id, String title, String companyName, String companyAddress, Date limitDate, ContractType contractType, SkillsEntity requiredSkills, Long minSalary, Long maxSalary, String description) {
        this.id = id;
        this.title = title;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.limitDate = limitDate;
        this.contractType = contractType;
        this.requiredSkills = requiredSkills;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public SkillsEntity getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(SkillsEntity requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    public Long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Long maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public JobOfferDTO() {
    }
}
