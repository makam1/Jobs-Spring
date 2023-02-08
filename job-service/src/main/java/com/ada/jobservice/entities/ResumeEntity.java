package com.ada.jobservice.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ResumeEntity {

    @Id
    private Long id;
     private Date dateOfBirth;
     private String title;
    private LangageEntity languages;
    private FormationEntity formations;
    private SkillsEntity skills;
    private CertificationEntity certificats;
    private ExperienceEntity experiences;
    private HobbiesEntity hobbies;

    public ResumeEntity(Long id,Date dateOfBirth, String title, LangageEntity languages, FormationEntity formations, SkillsEntity skills, CertificationEntity certificats, ExperienceEntity experiences, HobbiesEntity hobbies) {
        this.dateOfBirth = dateOfBirth;
        this.title = title;
        this.languages = languages;
        this.formations = formations;
        this.skills = skills;
        this.certificats = certificats;
        this.experiences = experiences;
        this.hobbies = hobbies;
        this.id=id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LangageEntity getLanguages() {
        return languages;
    }

    public void setLanguages(LangageEntity languages) {
        this.languages = languages;
    }

    public FormationEntity getFormations() {
        return formations;
    }

    public void setFormations(FormationEntity formations) {
        this.formations = formations;
    }

    public SkillsEntity getSkills() {
        return skills;
    }

    public void setSkills(SkillsEntity skills) {
        this.skills = skills;
    }

    public CertificationEntity getCertificats() {
        return certificats;
    }

    public void setCertificats(CertificationEntity certificats) {
        this.certificats = certificats;
    }

    public ExperienceEntity getExperiences() {
        return experiences;
    }

    public void setExperiences(ExperienceEntity experiences) {
        this.experiences = experiences;
    }

    public HobbiesEntity getHobbies() {
        return hobbies;
    }

    public void setHobbies(HobbiesEntity hobbies) {
        this.hobbies = hobbies;
    }
}
