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
@Table(name = "color")
public class color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private itemDetail itemDetail;

    private String colorName;

    public color() {
    }

    public color(int id, itemDetail itemDetail, String colorName) {
        this.id = id;
        this.itemDetail = itemDetail;
        this.colorName = colorName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public itemDetail getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(itemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getColorName() {
        return this.colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public color id(int id) {
        setId(id);
        return this;
    }

    public color itemDetail(itemDetail itemDetail) {
        setItemDetail(itemDetail);
        return this;
    }

    public color colorName(String colorName) {
        setColorName(colorName);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof color)) {
            return false;
        }
        color color = (color) o;
        return id == color.id && Objects.equals(itemDetail, color.itemDetail)
                && Objects.equals(colorName, color.colorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemDetail, colorName);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                ", colorName='" + getColorName() + "'" +
                "}";
    }

}
