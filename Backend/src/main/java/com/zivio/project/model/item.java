package com.zivio.project.model;

import java.math.BigDecimal;
import java.security.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String item_name;
    private String description;
    private BigDecimal price;
    private byte picture;
    private int stock;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<itemDetail> items = new ArrayList<>();

    public item() {
    }

    public item(int id, String item_name, String description, BigDecimal price, byte picture, int stock,
            Timestamp createdDate, Timestamp updatedDate) {
        this.id = id;
        this.item_name = item_name;
        this.description = description;
        this.price = price;
        this.picture = picture;
        this.stock = stock;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return this.item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public byte getPicture() {
        return this.picture;
    }

    public void setPicture(byte picture) {
        this.picture = picture;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public item id(int id) {
        setId(id);
        return this;
    }

    public item item_name(String item_name) {
        setItem_name(item_name);
        return this;
    }

    public item description(String description) {
        setDescription(description);
        return this;
    }

    public item price(BigDecimal price) {
        setPrice(price);
        return this;
    }

    public item picture(byte picture) {
        setPicture(picture);
        return this;
    }

    public item stock(int stock) {
        setStock(stock);
        return this;
    }

    public item createdDate(Timestamp createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public item updatedDate(Timestamp updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof item)) {
            return false;
        }
        item item = (item) o;
        return id == item.id && Objects.equals(item_name, item.item_name)
                && Objects.equals(description, item.description) && Objects.equals(price, item.price)
                && picture == item.picture && stock == item.stock && Objects.equals(createdDate, item.createdDate)
                && Objects.equals(updatedDate, item.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, item_name, description, price, picture, stock, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", item_name='" + getItem_name() + "'" +
                ", description='" + getDescription() + "'" +
                ", price='" + getPrice() + "'" +
                ", picture='" + getPicture() + "'" +
                ", stock='" + getStock() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                "}";
    }

}
