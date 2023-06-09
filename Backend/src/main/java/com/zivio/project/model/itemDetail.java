package com.zivio.project.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "itemDetail")
public class itemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemDetail_id;
    private int stock;

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<item> item = new ArrayList<>();

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<color> color = new ArrayList<>();

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<size> size = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private cart cart;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdDate;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant updatedDate;

    public itemDetail() {
    }

    public itemDetail(int itemDetail_id, int stock, List<item> item, List<color> color, List<size> size, cart cart,
            Instant createdDate, Instant updatedDate) {
        this.itemDetail_id = itemDetail_id;
        this.stock = stock;
        this.item = item;
        this.color = color;
        this.size = size;
        this.cart = cart;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getItemDetail_id() {
        return this.itemDetail_id;
    }

    public void setItemDetail_id(int itemDetail_id) {
        this.itemDetail_id = itemDetail_id;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<item> getItem() {
        return this.item;
    }

    public void setItem(List<item> item) {
        this.item = item;
    }

    public List<color> getColor() {
        return this.color;
    }

    public void setColor(List<color> color) {
        this.color = color;
    }

    public List<size> getSize() {
        return this.size;
    }

    public void setSize(List<size> size) {
        this.size = size;
    }

    public cart getCart() {
        return this.cart;
    }

    public void setCart(cart cart) {
        this.cart = cart;
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

    public itemDetail itemDetail_id(int itemDetail_id) {
        setItemDetail_id(itemDetail_id);
        return this;
    }

    public itemDetail stock(int stock) {
        setStock(stock);
        return this;
    }

    public itemDetail item(List<item> item) {
        setItem(item);
        return this;
    }

    public itemDetail color(List<color> color) {
        setColor(color);
        return this;
    }

    public itemDetail size(List<size> size) {
        setSize(size);
        return this;
    }

    public itemDetail cart(cart cart) {
        setCart(cart);
        return this;
    }

    public itemDetail createdDate(Instant createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public itemDetail updatedDate(Instant updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof itemDetail)) {
            return false;
        }
        itemDetail itemDetail = (itemDetail) o;
        return itemDetail_id == itemDetail.itemDetail_id && stock == itemDetail.stock
                && Objects.equals(item, itemDetail.item) && Objects.equals(color, itemDetail.color)
                && Objects.equals(size, itemDetail.size) && Objects.equals(cart, itemDetail.cart)
                && Objects.equals(createdDate, itemDetail.createdDate)
                && Objects.equals(updatedDate, itemDetail.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDetail_id, stock, item, color, size, cart, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return "{" +
                " itemDetail_id='" + getItemDetail_id() + "'" +
                ", stock='" + getStock() + "'" +
                ", item='" + getItem() + "'" +
                ", color='" + getColor() + "'" +
                ", size='" + getSize() + "'" +
                ", cart='" + getCart() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                "}";
    }

}
