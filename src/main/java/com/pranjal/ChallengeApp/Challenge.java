package com.pranjal.ChallengeApp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Challenge {
    public void setId(Long id) {
        this.id = id;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getMonth() {
        return month;
    }

    public String getDescription() {
        return description;
    }

    public Challenge() {
    }

    @Id
    private Long id;
    @Column(name = "challengeMonth")
    private String month;
    private String description;

    public Challenge(Long id, String month, String description){
        this.id = id;
        this.month = month;
        this.description = description;
    }


}
