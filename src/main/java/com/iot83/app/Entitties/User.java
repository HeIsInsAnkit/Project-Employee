package com.iot83.app.Entitties;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private String Id;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Email;
    private String password;
    private String MobileNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Team team;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public User(String id, String firstName, String middleName, String lastName, String email, String password, String mobileNumber, Role role, Team team) {
        super();
        Id = id;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        Email = email;
        this.password = password;
        MobileNumber = mobileNumber;
        this.role = role;
        this.team = team;
    }

    public  User() {
        super();
    }
}
