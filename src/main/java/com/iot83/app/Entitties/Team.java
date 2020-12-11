package com.iot83.app.Entitties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private String id;
    private String teamName;

    public Team() {
        super();
    }

    public Team(String id, String teamName) {
        super();
        this.id = id;
        this.teamName = teamName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
