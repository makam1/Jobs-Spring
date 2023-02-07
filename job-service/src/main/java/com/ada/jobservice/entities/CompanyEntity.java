package com.ada.jobservice.entities;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ada.jobservice.entities.enums.CompanyDomain;
import com.ada.jobservice.entities.enums.CompanySector;


@Document("company")
public class CompanyEntity {

	@Id
	private Integer id;
    private String ninea;
    private String  denomination;
    private String description;
    private  CompanySector sector;
    private CompanyDomain domain ;
    private String headquaters;
    private String officephone;
    
    
	public CompanyEntity(Integer id, String ninea, String denomination, String description, CompanySector sector,
			CompanyDomain domain, String headquaters, String officephone) {
		super();
		this.id = id;
		this.ninea = ninea;
		this.denomination = denomination;
		this.description = description;
		this.sector = sector;
		this.domain = domain;
		this.headquaters = headquaters;
		this.officephone = officephone;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getOfficephone() {
		return officephone;
	}
	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}
    
    
}
