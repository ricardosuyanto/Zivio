package com.zivio.project.model;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.time.Instant;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "item")
public class item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;
    private String item_name;
    private String description;
    private BigDecimal price;

    @Lob
    @Column(name = "picture", columnDefinition = "bytea")
    private byte[] picture;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemType_id", referencedColumnName = "itemType_id")
    private itemType itemType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private itemDetail itemDetail;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdDate;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedDate;

    public item() {
    }

    public item(Long item_id, String item_name, String description, BigDecimal price, byte[] picture, itemType itemType,
            itemDetail itemDetail, Instant createdDate, Instant updatedDate) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.description = description;
        this.price = price;
        this.picture = picture;
        this.itemType = itemType;
        this.itemDetail = itemDetail;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Long getItem_id() {
        return this.item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
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

    public byte[] getPicture() {
        return this.picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public itemType getItemType() {
        return this.itemType;
    }

    public void setItemType(itemType itemType) {
        this.itemType = itemType;
    }

    public itemDetail getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(itemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public Instant getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public item item_id(Long item_id) {
        setItem_id(item_id);
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

    public item picture(byte[] picture) {
        setPicture(picture);
        return this;
    }

    public item itemType(itemType itemType) {
        setItemType(itemType);
        return this;
    }

    public item itemDetail(itemDetail itemDetail) {
        setItemDetail(itemDetail);
        return this;
    }

    public item createdDate(Instant createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public item updatedDate(Instant updatedDate) {
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
        return Objects.equals(item_id, item.item_id) && Objects.equals(item_name, item.item_name)
                && Objects.equals(description, item.description) && Objects.equals(price, item.price)
                && Objects.equals(picture, item.picture) && Objects.equals(itemType, item.itemType)
                && Objects.equals(itemDetail, item.itemDetail) && Objects.equals(createdDate, item.createdDate)
                && Objects.equals(updatedDate, item.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item_id, item_name, description, price, picture, itemType, itemDetail, createdDate,
                updatedDate);
    }

    @Override
    public String toString() {
        return "{" +
                " item_id='" + getItem_id() + "'" +
                ", item_name='" + getItem_name() + "'" +
                ", description='" + getDescription() + "'" +
                ", price='" + getPrice() + "'" +
                ", picture='" + getPicture() + "'" +
                ", itemType='" + getItemType() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                "}";
    }

}
