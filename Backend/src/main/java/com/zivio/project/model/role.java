package com.zivio.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "role")
public class role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;
    private String role;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private user user;

    public role() {
    }

    public role(int role_id, String role, user user) {
        this.role_id = role_id;
        this.role = role;
        this.user = user;
    }

    public int getRole_id() {
        return this.role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public user getUser() {
        return this.user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public role role_id(int role_id) {
        setRole_id(role_id);
        return this;
    }

    public role role(String role) {
        setRole(role);
        return this;
    }

    public role user(user user) {
        setUser(user);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof role)) {
            return false;
        }
        role role = (role) o;
        return role_id == role.role_id && Objects.equals(role, role.role) && Objects.equals(user, role.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role_id, role, user);
    }

    @Override
    public String toString() {
        return "{" +
                " role_id='" + getRole_id() + "'" +
                ", role='" + getRole() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

}
