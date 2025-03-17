package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    private int aId;

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    private String aName;
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
