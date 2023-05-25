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
    private int id;

    private String roles_name;

    public Roles() {
    }

    public Roles(int id, String roles_name) {
        this.id = id;
        this.roles_name = roles_name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoles_name() {
        return this.roles_name;
    }

    public void setRoles_name(String roles_name) {
        this.roles_name = roles_name;
    }

    public Roles id(int id) {
        setId(id);
        return this;
    }

    public Roles roles_name(String roles_name) {
        setRoles_name(roles_name);
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
        return id == roles.id && Objects.equals(roles_name, roles.roles_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roles_name);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", roles_name='" + getRoles_name() + "'" +
                "}";
    }

}
