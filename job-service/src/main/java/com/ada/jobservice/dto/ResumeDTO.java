package com.ada.jobservice.dto;

import com.ada.jobservice.entities.*;

import java.util.Date;

public class ResumeDTO {
        private String id;
        private Date dateOfBirth;
        private String title;
        private String languages;
        private String formations;
        private String skills;
        private String certificats;
        private String experiences;
        private String hobbies;
        private String user;


    public ResumeDTO() {
    }

    public ResumeDTO(String user,String id, Date dateOfBirth, String title, String languages, String formations, String skills, String certificats, String experiences, String hobbies) {
            this.dateOfBirth = dateOfBirth;
            this.title = title;
            this.languages = languages;
            this.formations = formations;
            this.skills = skills;
            this.certificats = certificats;
            this.experiences = experiences;
            this.hobbies = hobbies;
            this.id=id;
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

        public String getLanguages() {
            return languages;
        }

        public void setLanguages(String languages) {
            this.languages = languages;
        }

        public String getFormations() {
            return formations;
        }

        public void setFormations(String String) {
            this.formations = formations;
        }

        public String getSkills() {
            return skills;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        public String getCertificats() {
            return certificats;
        }

        public void setCertificats(String certificats) {
            this.certificats = certificats;
        }

        public String getExperiences() {
            return experiences;
        }

        public void setExperiences(String experiences) {
            this.experiences = experiences;
        }

        public String getHobbies() {
            return hobbies;
        }

        public void setHobbies(String hobbies) {
            this.hobbies = hobbies;
        }

}
