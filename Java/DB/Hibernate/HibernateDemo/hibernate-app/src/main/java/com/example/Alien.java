package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alien")
public class Alien {

    @Id
    private int aId;

    public Aname getaName() {
        return aName;
    }

    public void setaName(Aname aName) {
        this.aName = aName;
    }

    private Aname aName;
    private String aColor;
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }


    public String getaColor() {
        return aColor;
    }

    public void setaColor(String aColor) {
        this.aColor = aColor;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aColor='" + aColor + '\'' +
                '}';
    }
}
