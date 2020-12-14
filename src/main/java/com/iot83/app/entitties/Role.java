package com.iot83.app.entitties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

    @Id
    private String id;
    private String roleName;

    public Role() {
        super();
    }

    public Role(String id, String userRole) {
        super();
        this.id = id;
        this.roleName = userRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
