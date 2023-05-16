package com.zivio.project.model;

import java.security.Timestamp;

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
@Table(name = "status")
public class status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int status_id;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private transaction transaction;

    public status() {
    }

    public status(int status_id, Timestamp createdDate, Timestamp updatedDate) {
        this.status_id = status_id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;

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

    @Override
    public int hashCode() {
        return Objects.hash(status_id, createdDate, updatedDate);
    }

    @Override
    public String toString() {
        return "{" +
                " status_id='" + getStatus_id() + "'" +
                ", createdDate='" + getCreatedDate() + "'" +
                ", updatedDate='" + getUpdatedDate() + "'" +
                "'" +
                "}";
    }

}
