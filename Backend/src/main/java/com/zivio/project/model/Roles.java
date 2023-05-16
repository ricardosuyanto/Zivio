package com.zivio.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roles_id;
    private String roles_name;

    @OneToOne(mappedBy = "roles")
    private Users user;

    public Roles() {
    }

    public Roles(int roles_id, String roles_name, Users user) {
        this.roles_id = roles_id;
        this.roles_name = roles_name;
        this.user = user;
    }

    public int getRoles_id() {
        return this.roles_id;
    }

    public void setRoles_id(int roles_id) {
        this.roles_id = roles_id;
    }

    public String getRoles_name() {
        return this.roles_name;
    }

    public void setRoles_name(String roles_name) {
        this.roles_name = roles_name;
    }

    public Users getUser() {
        return this.user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Roles roles_id(int roles_id) {
        setRoles_id(roles_id);
        return this;
    }

    public Roles roles_name(String roles_name) {
        setRoles_name(roles_name);
        return this;
    }

    public Roles user(Users user) {
        setUser(user);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Roles)) {
            return false;
        }
        Roles roles = (Roles) o;
        return roles_id == roles.roles_id && Objects.equals(roles_name, roles.roles_name)
                && Objects.equals(user, roles.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roles_id, roles_name, user);
    }

    @Override
    public String toString() {
        return "{" +
                " roles_id='" + getRoles_id() + "'" +
                ", roles_name='" + getRoles_name() + "'" +
                ", user='" + getUser() + "'" +
                "}";
    }

}
