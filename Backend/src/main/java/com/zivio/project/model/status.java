package com.zivio.project.model;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "status")
public class status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int status_id;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id", nullable = false)
    private itemDetail itemDetail;

    public status() {
    }

    public status(int status_id, Timestamp createdDate, Timestamp updatedDate, itemDetail itemDetail) {
        this.status_id = status_id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.itemDetail = itemDetail;
    }

    public int getStatus_id() {
        return this.status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
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

    public itemDetail getItemDetail() {
        return this.itemDetail;
    }

    public void setItemDetail(itemDetail itemDetail) {
        this.itemDetail = itemDetail;
    }

    public status status_id(int status_id) {
        setStatus_id(status_id);
        return this;
    }

    public status createdDate(Timestamp createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public status updatedDate(Timestamp updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public status itemDetail(itemDetail itemDetail) {
        setItemDetail(itemDetail);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof status)) {
            return false;
        }
        status status = (status) o;
        return status_id == status.status_id && Objects.equals(createdDate, status.createdDate)
                && Objects.equals(updatedDate, status.updatedDate) && Objects.equals(itemDetail, status.itemDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status_id, createdDate, updatedDate, itemDetail);
    }

    @Override
    public String toString() {
        return "{" +
                " status_id='" + getStatus_id() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                ", itemDetail='" + getItemDetail() + "'" +
                "}";
    }

}
