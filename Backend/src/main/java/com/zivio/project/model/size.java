package com.zivio.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "size")
public class size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int size_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private itemDetail itemDetail;

    private String size;

    public size() {
    }

    public size(int size_id, itemDetail itemDetail, String size) {
        this.size_id = size_id;
        this.itemDetail = itemDetail;
        this.size = size;
    }

    public int getSize_id() {
        return this.size_id;
    }

    public void setSize_id(int size_id) {
        this.size_id = size_id;
    }

    public itemDetail getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(itemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public size size_id(int size_id) {
        setSize_id(size_id);
        return this;
    }

    public size itemDetail(itemDetail itemDetail) {
        setItemDetail(itemDetail);
        return this;
    }

    public size size(String size) {
        setSize(size);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof size)) {
            return false;
        }
        size size = (size) o;
        return size_id == size.size_id && Objects.equals(itemDetail, size.itemDetail)
                && Objects.equals(size, size.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size_id, itemDetail, size);
    }

    @Override
    public String toString() {
        return "{" +
                " size_id='" + getSize_id() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                ", size='" + getSize() + "'" +
                "}";
    }

}
