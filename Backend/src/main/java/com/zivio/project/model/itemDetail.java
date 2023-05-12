package com.zivio.project.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "itemDetail")
public class itemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemDetail_id;
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", nullable = false)
    private cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id", nullable = false)
    private transaction transaction;

    @OneToMany(mappedBy = "itemDetail_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<color> color = new ArrayList<>();

    @OneToMany(mappedBy = "itemDetail_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<size> size = new ArrayList<>();

    public itemDetail() {
    }

    public itemDetail(int itemDetail_id, int stock, item item, List<color> color, List<size> size) {
        this.itemDetail_id = itemDetail_id;
        this.stock = stock;
        this.item = item;
        this.color = color;
        this.size = size;
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

    public item getItem() {
        return this.item;
    }

    public void setItem(item item) {
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

    public itemDetail itemDetail_id(int itemDetail_id) {
        setItemDetail_id(itemDetail_id);
        return this;
    }

    public itemDetail stock(int stock) {
        setStock(stock);
        return this;
    }

    public itemDetail item(item item) {
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
                && Objects.equals(size, itemDetail.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDetail_id, stock, item, color, size);
    }

    @Override
    public String toString() {
        return "{" +
                " itemDetail_id='" + getItemDetail_id() + "'" +
                ", stock='" + getStock() + "'" +
                ", item='" + getItem() + "'" +
                ", color='" + getColor() + "'" +
                ", size='" + getSize() + "'" +
                "}";
    }

}
