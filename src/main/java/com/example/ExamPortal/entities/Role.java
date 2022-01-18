package com.example.ExamPortal.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity()
@Table(name="role")
public class Role {
    @Id
    private int roleId;
    private String roleName;

    @OneToMany(cascade =  CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "role")
    private Set<UserRole> userRoles=new HashSet<>();

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
