package com.zivio.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "itemType")
public class itemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemType_id;
    private String type_name;
    private String createdDate;
    private String updatedDate;

    @OneToOne(mappedBy = "itemType")
    private item item;

    public itemType() {
    }

    public itemType(int itemType_id, String type_name, String createdDate, String updatedDate, item item) {
        this.itemType_id = itemType_id;
        this.type_name = type_name;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.item = item;
    }

    public int getItemType_id() {
        return this.itemType_id;
    }

    public void setItemType_id(int itemType_id) {
        this.itemType_id = itemType_id;
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

    public item getItem() {
        return this.item;
    }

    public void setItem(item item) {
        this.item = item;
    }

    public itemType itemType_id(int itemType_id) {
        setItemType_id(itemType_id);
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

    public itemType item(item item) {
        setItem(item);
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
        return itemType_id == itemType.itemType_id && Objects.equals(type_name, itemType.type_name)
                && Objects.equals(createdDate, itemType.createdDate)
                && Objects.equals(updatedDate, itemType.updatedDate) && Objects.equals(item, itemType.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemType_id, type_name, createdDate, updatedDate, item);
    }

    @Override
    public String toString() {
        return "{" +
                " itemType_id='" + getItemType_id() + "'" +
                ", type_name='" + getType_name() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", item='" + getItem() + "'" +
                "}";
    }

}
