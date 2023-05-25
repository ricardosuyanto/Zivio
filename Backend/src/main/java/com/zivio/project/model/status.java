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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "itemDetail_id", nullable = false)
    private transaction transaction;

    public status() {
    }

    public status(int status_id, transaction transaction) {
        this.status_id = status_id;
        this.transaction = transaction;
    }

    public int getStatus_id() {
        return this.status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(transaction transaction) {
        this.transaction = transaction;
    }

    public status status_id(int status_id) {
        setStatus_id(status_id);
        return this;
    }

    public status transaction(transaction transaction) {
        setTransaction(transaction);
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
        return status_id == status.status_id && Objects.equals(transaction, status.transaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status_id, transaction);
    }

    @Override
    public String toString() {
        return "{" +
                " status_id='" + getStatus_id() + "'" +
                ", transaction='" + getTransaction() + "'" +
                "}";
    }

}
