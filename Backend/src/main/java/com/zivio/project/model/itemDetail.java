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
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "itemDetail")
public class itemDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private item item;

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<color> color = new ArrayList<>();

    @OneToMany(mappedBy = "itemDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<size> size = new ArrayList<>();

    public itemDetail() {
    }

    public itemDetail(int id, int stock, item item, List<color> color, List<size> size) {
        this.id = id;
        this.stock = stock;
        this.item = item;
        this.color = color;
        this.size = size;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public itemDetail id(int id) {
        setId(id);
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
        return id == itemDetail.id && stock == itemDetail.stock && Objects.equals(item, itemDetail.item)
                && Objects.equals(color, itemDetail.color) && Objects.equals(size, itemDetail.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stock, item, color, size);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", stock='" + getStock() + "'" +
                ", item='" + getItem() + "'" +
                ", color='" + getColor() + "'" +
                ", size='" + getSize() + "'" +
                "}";
    }

}
