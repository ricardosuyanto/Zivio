package com.zivio.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "itemType")
public class itemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type_name;
    private String createdDate;
    private String updatedDate;

    public itemType() {
    }

    public itemType(int id, String type_name, String createdDate, String updatedDate) {
        this.id = id;
        this.type_name = type_name;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_name() {
        return this.type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public itemType id(int id) {
        setId(id);
        return this;
    }

    public itemType type_name(String type_name) {
        setType_name(type_name);
        return this;
    }

    public itemType createdDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public itemType updatedDate(String updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof itemType)) {
            return false;
        }
        itemType itemType = (itemType) o;
        return id == itemType.id && Objects.equals(type_name, itemType.type_name)
                && Objects.equals(createdDate, itemType.createdDate)
                && Objects.equals(updatedDate, itemType.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type_name, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", type_name='" + getType_name() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                "}";
    }

}
