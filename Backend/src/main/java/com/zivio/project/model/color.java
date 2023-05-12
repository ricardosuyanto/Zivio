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
    private int color_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private itemDetail itemDetail;

    private String colorName;

    public color() {
    }

    public color(int color_id, itemDetail itemDetail, String colorName) {
        this.color_id = color_id;
        this.itemDetail = itemDetail;
        this.colorName = colorName;
    }

    public int getColor_id() {
        return this.color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
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

    public color color_id(int color_id) {
        setColor_id(color_id);
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
        return color_id == color.color_id && Objects.equals(itemDetail, color.itemDetail)
                && Objects.equals(colorName, color.colorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color_id, itemDetail, colorName);
    }

    @Override
    public String toString() {
        return "{" +
                " color_id='" + getColor_id() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                ", colorName='" + getColorName() + "'" +
                "}";
    }

}
