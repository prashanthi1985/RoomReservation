package com.crs.reservation.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {


    @Id
    private Long roleId;
    private String role;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
